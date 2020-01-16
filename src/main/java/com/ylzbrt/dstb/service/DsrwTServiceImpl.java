package com.ylzbrt.dstb.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.dao.*;
import com.ylzbrt.dstb.dsrw.DynamicScheduleTask;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.entity.Timer;
import com.ylzbrt.dstb.util.FieldsAnnotation;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: linzehang
 * @CreateTime: 2020-01-06 10:50
 * @Description: ${7张表的数据传输}
 */

@Service
public class DsrwTServiceImpl implements DsrwTService {

    @Autowired
    private ZwAc01Mapper ac01Mapper;
    @Autowired
    private ZwAc43TempMapper ac43Mapper;
    @Autowired
    private ZwKc26TempMapper kc26Mapper;
    @Autowired
    private ZwKa08TempMapper ka08Mapper;
    @Autowired
    private ZwKc01TempMapper kc01Mapper;
    @Autowired
    private ZwKc99TempMapper kc99Mapper;
    @Autowired
    private ZwKslwTempMapper kslwMapper;
    @Autowired
    private TimerMapper timerMapper;

    @Async
    @Override
    public void zwAc01() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_ac01");
        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
        //执行存储过程
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwAc01> zwAc01s = ac01Mapper.selectZwAC01();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwAc01s)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwAc01s);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwAc01s, ZwAc01.class, str);
                if ("errorMsg".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }
                // 传输数据
                sendXml(xml, Catalog.ac01, result);
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
                System.out.println("zw_ac01 循环了第" + i + "次");
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }else{
           // sendMail("zw_ac01:" +errorMsg);
        }
        timerMapper.insert(new Timer(new Date(),"zw_ac01","zw_ac01 : " + errorMsg));
        System.out.println("zw_ac01 :"+errorMsg);
        errorMsg = "";
    }


    @Async
    @Override
    public void zwKa08() {
        String errorMsg = null;
        StringBuffer str = new StringBuffer();
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 --zwKa08");
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
        ka08Mapper.ProZwKa08(map);
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                PageHelper.startPage(i, 500);
                List <ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08Temp();
                if (CollectionUtils.isEmpty(zwKa08Temps)) {
                    errorMsg =  "没有数据更新";
                    break;
                }
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKa08Temps);
                    pageNo = pageInfo.getPages();
                }
                String xml = concatXml(zwKa08Temps, ZwKa08Temp.class, str);
                if ("errorMsg".equals(xml)) {
                    errorMsg =  "concatXml错误";
                    break;
                }
                sendXml(xml, Catalog.ka08, result);
                if (result.get("exception") != null) {
                    errorMsg = result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg = result.get("msg");
                    break;
                }
                str.delete(0, str.length());
                System.out.println("zw_ka08 循环了第" + i + "次");
            }
            str.delete(0, str.length());
        } else {
            errorMsg =  "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }else{
            //sendMail("zw_ka08:" +errorMsg);
        }
        timerMapper.insert(new Timer(new Date(),"zw_ka08","zw_ka08 : "+ errorMsg));
        System.out.println("zw_ka08 :"+errorMsg);
        errorMsg = "";
    }


    @Async
    @Override
    public void zwKslw() {
        String errorMsg = null;
        StringBuffer str = new StringBuffer();
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 --zwKslw");
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
        kslwMapper.ProZwKslw(map);
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                PageHelper.startPage(i, 500);
                List <ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwTemp();
                if (CollectionUtils.isEmpty(zwKslwTemps)) {
                    errorMsg =  "没有数据更新";
                    break;
                }
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKslwTemps);
                    pageNo = pageInfo.getPages();
                }
                String xml = concatXml(zwKslwTemps, ZwKslwTemp.class, str);
                if ("errorMsg".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }
                sendXml(xml, Catalog.kslw, result);
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
                System.out.println("zw_kslw 循环了第" + i + "次");
            }
            str.delete(0, str.length());
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            //errorMsg = "zw_kslw 政务数据更新成功";
        }
        timerMapper.insert(new Timer(new Date(),"zw_kslw","zw_kslw : " + errorMsg));
        System.out.println("zw_kslw :"+errorMsg);
        errorMsg="";
    }


    /**
     * 拼接xml格式文件
     *
     * @param ob
     * @param cl
     * @return
     */
    public String concatXml(List <?> ob, Class <?> cl, StringBuffer str) {
        try {
            str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<table>");
            for (int i = 0; i < ob.size(); i++) {
                str.append("<row type=\"add\">");
                Field[] declaredFields = cl.getDeclaredFields();
                for (Field f : declaredFields) {
                    f.setAccessible(true);
                    str.append("<" + f.getName() + " name=\"" + f.getAnnotation(FieldsAnnotation.class).value() + "\" isattachment=\"false\"><![CDATA[" + f.get(ob.get(i)) + "]]></" + f.getName() + ">");
                }
                str.append("</row>");
            }
            str.append("</table>");
        } catch (IllegalAccessException e) {
            str.delete(0, str.length());
            str.append("errorMsg");
        }
        return str.toString();
    }

    /**
     * 传输数据到政务平台
     *
     * @param xml
     * @param catLog
     * @return
     */
    public void sendXml(String xml, String catLog, Map <String, String> result) {
        Object[] invoke = null;
        boolean flag = false;
        try {
            //获取政务返回的gid
            for (int i = 0; i < 5; i++) {
                invoke = DynamicScheduleTask.webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                if (!"err".equalsIgnoreCase(invoke[0].toString())) {
                    flag = true;
                    break;
                }
                System.out.println("第" + i + "次登入政务成功");
            }
            //获取到的gid可行的情况下，传输数据
            if (flag) {
                //推送数据
                invoke = DynamicScheduleTask.webService.invoke("pushXml", invoke[0].toString(), catLog, xml);
                //解析返回数据
                delReturnMsg(invoke, result);
            } else {
                result.put("exception", "政务平台登入不进去，有可能是配置的账号密码有误");
            }
        } catch (Exception e) {
            result.put("exception", "sendXml 出现异常");
        }
    }


    //判断返回数据
    public void delReturnMsg(Object[] objects, Map <String, String> map) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document parse = builder.parse(new InputSource(new StringReader(objects[0].toString())));
            NodeList flag = parse.getElementsByTagName("flag");
            NodeList msg = parse.getElementsByTagName("msg");
            Node item = flag.item(0);
            Node item2 = msg.item(0);
            String valueFlag = item.getFirstChild().getNodeValue();
            String valueMsg = item2.getFirstChild().getNodeValue();
            map.put("flag", valueFlag);
            map.put("msg", valueMsg);
        } catch (Exception e) {
            map.put("exception", "delReturnMsg方法抛异常");
        }
    }


    //实现JavaMailSender，自定义邮件发送器
    public JavaMailSenderImpl makeMail() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(DynamicScheduleTask.configEntity.getHost());
        mailSender.setUsername(DynamicScheduleTask.configEntity.getMailSender());
        mailSender.setPassword(DynamicScheduleTask.configEntity.getPwd());
        mailSender.setDefaultEncoding("UTF-8");
        Properties p = new Properties();
        p.setProperty("mail.smtp.auth", "true");
        mailSender.setJavaMailProperties(p);
        return mailSender;
    }

    //发邮件
    public void sendMail(String errorMsg) {
        MimeMessage mimeMessage = makeMail().createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
            messageHelper.setFrom(DynamicScheduleTask.configEntity.getMailSender(), "定时更新政务数据");
            messageHelper.setTo(DynamicScheduleTask.configEntity.getMailReceiver());
            messageHelper.setSubject("政务跑批更新" + LocalDateTime.now());
            messageHelper.setText(errorMsg);
            makeMail().send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
