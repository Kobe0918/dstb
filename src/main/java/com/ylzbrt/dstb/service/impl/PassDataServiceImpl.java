package com.ylzbrt.dstb.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import com.ylzbrt.dstb.common.GetGuidTools;
import com.ylzbrt.dstb.controller.DynamicScheduleTask;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.mapper.*;
import com.ylzbrt.dstb.service.ILogService;
import com.ylzbrt.dstb.service.IPassDataService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.List;


/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-02-12 21:20
 * @Description: ${Description}
 */
@Service
@Slf4j
public class PassDataServiceImpl implements IPassDataService {

    @Autowired
    private ILogService logService;
//    @Autowired
//    Utils utils;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /*测试重复数据*/
    @Resource
    private ZwAc43TempMapper ac43Mapper;
    @Resource
    private ZwKc26TempMapper kc26Mapper;
    @Resource
    private ZwAc01Mapper zwAc01Mapper;
    @Resource
    private ZwKc01TempMapper kc01Mapper;
    @Resource
    private ZwKc99TempMapper kc99Mapper;
    @Resource
    private ZwKslwTempMapper kslwMapper;
    @Resource
    private ZwKa08TempMapper ka08TempMapper;


    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataAc01(List<ZwAc01> ob) {
        zwAc01Mapper.insertZwAc01(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataKc26(List<ZwKc26Temp> ob) {
        kc26Mapper.insertZwKc26(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataKc99(List<ZwKc99Temp> ob) {
        kc99Mapper.insertZwKc99(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataAc43(List<ZwAc43Temp> ob) {
        ac43Mapper.insertZwAc43(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataKc01(List<ZwKc01Temp> ob) {
        kc01Mapper.insertZwKc01(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataKslw(List<ZwKslwTemp> ob) {
        kslwMapper.insertZwKslw(ob);
    }

    @Async(value = "asyncServiceExecutor")
    @Override
    public void passDataKa08(List<ZwKa08Temp> ob) {
        ka08TempMapper.insertZwKa08(ob);
    }


    @Async(value = "asyncServiceExecutor")
    @Override
    public void passData(List<?> ob, Class<?> cl, String catalog, String action) {

        //拼接xml数据
        StringBuffer str = new StringBuffer();
        try {
            str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<table>");
            for (int i = 0; i < ob.size(); i++) {
                str.append("<row type=\"" + action + "\">");
                Field[] declaredFields = cl.getDeclaredFields();
                for (Field f : declaredFields) {
                    f.setAccessible(true);
                    if (!"reason".equals(f.getName())) {
                        str.append("<" + f.getName() + " name=\"" + f.getAnnotation(FieldsAnnotation.class).value()
                                + "\" isattachment=\"false\"><![CDATA[" + (f.get(ob.get(i)) == null || "".equals(f.get(ob.get(i)).toString().trim()) || "null".equalsIgnoreCase(f.get(ob.get(i)).toString()) ? "" : f.get(ob.get(i))) + "]]></" + f.getName() + ">");
                    }
                }
                str.append("</row>");
            }
            str.append("</table>");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        String data = str.toString();
        //log.info("data :"+ data);
        // 调用政务接口传输数据
        try {
            if (StringUtils.isEmpty(GetGuidTools.TOKEN)) {
                GetGuidTools.TOKEN = GetGuidTools.getGuid();
            }
            //utils.getGuid()
            //log.info(GetGuidTools.TOKEN+" : token");
            Object[] pushXmls = DynamicScheduleTask.client.invoke("pushXml", GetGuidTools.TOKEN, catalog, data);
            //解析返回数据
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document parse = builder.parse(new InputSource(new StringReader(pushXmls[0].toString())));
            NodeList flag = parse.getElementsByTagName("flag");
            NodeList msg = parse.getElementsByTagName("msg");
            Node item = flag.item(0);
            Node item2 = msg.item(0);
            String valueFlag = item.getFirstChild().getNodeValue();
            String valueMsg = item2.getFirstChild().getNodeValue();
            String resultMsg = cl.getSimpleName() + " : " + valueMsg;
            logger.info(resultMsg);
            if ("false".equals(valueFlag)) {
                logService.doInsertLog(catalog, data, resultMsg, "0");
                if (valueMsg.contains("guid已过期")) {
                    GetGuidTools.TOKEN = GetGuidTools.getGuid();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logService.doInsertLog(catalog, data, e.toString(), "0");
        }
    }


    /**
     * 推送错误数据
     */
    @Async(value = "asyncServiceExecutor")
    @Override
    public void passErrorData(Zw_sjts_log data) {
        String logId = data.getLogid();

        try {
            if (StringUtils.isEmpty(GetGuidTools.TOKEN)) {
                GetGuidTools.TOKEN = GetGuidTools.getGuid();
            }
            Object[] pushXmls = DynamicScheduleTask.client.invoke("pushXml", GetGuidTools.TOKEN, data.getCatalog(), data.getSoapinxml());
            //解析返回数据
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document parse = builder.parse(new InputSource(new StringReader(pushXmls[0].toString())));
            NodeList flag = parse.getElementsByTagName("flag");
            NodeList msg = parse.getElementsByTagName("msg");
            Node item = flag.item(0);
            Node item2 = msg.item(0);
            String valueFlag = item.getFirstChild().getNodeValue();
            String valueMsg = item2.getFirstChild().getNodeValue();

            if ("true".equals(valueFlag)) {
                logService.doDelete(logId);
            }
            if ("false".equals(valueFlag)) {
                logService.updateLogIfFalse(valueMsg, logId);
                if (valueMsg.contains("guid已过期")) {
                    GetGuidTools.TOKEN = GetGuidTools.getGuid();
                }
            }
        } catch (Exception e) {
            logService.updateLogIfFalse("推送错误数据: " + e.getMessage(), logId);
        }
    }


    @Override
    public void passErrorData2(Zw_sjts_log data) {
        String logId = data.getLogid();

        try {
            if (StringUtils.isEmpty(GetGuidTools.TOKEN)) {
                GetGuidTools.TOKEN = GetGuidTools.getGuid();
            }
            Object[] pushXmls = DynamicScheduleTask.client.invoke("pushXml", GetGuidTools.TOKEN, data.getCatalog(), data.getSoapinxml());
            //解析返回数据
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document parse = builder.parse(new InputSource(new StringReader(pushXmls[0].toString())));
            NodeList flag = parse.getElementsByTagName("flag");
            NodeList msg = parse.getElementsByTagName("msg");
            Node item = flag.item(0);
            Node item2 = msg.item(0);
            String valueFlag = item.getFirstChild().getNodeValue();
            String valueMsg = item2.getFirstChild().getNodeValue();

            if ("true".equals(valueFlag)) {
                logService.doDelete(logId);
            }
            if ("false".equals(valueFlag)) {
                logService.updateLogIfFalse(valueMsg, logId);
                if (valueMsg.contains("guid已过期")) {
                    GetGuidTools.TOKEN = GetGuidTools.getGuid();
                }
            }
        } catch (Exception e) {
            logService.updateLogIfFalse("推送错误数据: " + e.getMessage(), logId);
        }
    }


//    /**
//     * guid过期，再去获取
//     * @param guid
//     */
//    private void getGuidIfInvalid(String guid){
//        if (!Utils.loginSuccess(guid)) {
//            try {
//                Client client = WbClient.getWebService();
//                Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
//                guid = guidObjects[0].toString();
//                logger.info("guid过期再次访问guid接口返回结果:{}", !Utils.loginSuccess(guid));
//            } catch (Exception e) {
//                e.printStackTrace();
//                logger.error("过期后再次获取gid接口异常（政务接口问题）");
//            }
//        }
//    }

}
