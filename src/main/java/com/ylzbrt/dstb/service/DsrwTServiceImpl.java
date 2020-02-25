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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: 林泽航
 * @CreateTime: 2020-01-06 10:50
 * @Description: ${ac01,ac43,kc26,ka08,kc01,kc99,kslw 7张表的数据传输}
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
    private PassDataService passDataService;

    public Logger logger = LoggerFactory.getLogger(this.getClass());



   @Override
   public void zwAc01(ConfigEntity configEntity){
       //执行存储过程   ****测试占时调用ac01 返回 1
       Map <String, Object> map = new HashMap <>();
       map.put("updator", configEntity.getUpdator());
       map.put("aaa027", configEntity.getAaa027());
       ac01Mapper.ProZwAc01(map);

       //判断存储过程执行结果
       if ("1".equals(map.get("result"))) {
           int pageNo = 1;
           String guid = getGuid();
           for (int i = 1; i <= pageNo; i++) {
               //分页获取数据
               PageHelper.startPage(i, 500);
               List <ZwAc01>  zwAC01List = ac01Mapper.selectZwAC01(configEntity.getAaa027());
               //判断  集合是否有值
               if (CollectionUtils.isEmpty(zwAC01List)) {
                   logger.info("zw_ac01 : 没有数据更新");
                   break;
               }
               //获取页数
               if (i == 1) {
                   PageInfo pageInfo = new PageInfo(zwAC01List);
                   pageNo = pageInfo.getPages();
               }
               //多线程跑数据
                passDataService.passData(zwAC01List, ZwAc01.class, Catalog.ac01, guid);
           }
       } else {
           logger.info("zw_ac01 : 存储过程出错");
    }
   }


    @Override
    public void zwKa08(ConfigEntity configEntity) {

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        ka08Mapper.ProZwKa08(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
                int pageNo = 1;
                String guid=getGuid();

                for (int i = 1; i <= pageNo; i++) {
                    //分页获取数据
                    PageHelper.startPage(i, 500);
                    List <ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08Temp(configEntity.getAaa027());

                    //判断  集合是否有值
                    if (CollectionUtils.isEmpty(zwKa08Temps)) {
                        logger.info("zw_ka08 : 没有数据更新");
                        break;
                    }
                    //获取页数
                    if (i == 1) {
                        PageInfo pageInfo = new PageInfo(zwKa08Temps);
                        pageNo = pageInfo.getPages();
                    }
                    //多线程跑数据
                    passDataService.passData(zwKa08Temps,ZwKa08Temp.class,Catalog.ka08,guid);
                }
        } else {
            logger.info("zw_ka08 : 存储过程出错");
        }
    }



    @Override
    public void zwKc01(ConfigEntity configEntity) {
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc01Mapper.ProZwK01(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            String guid = getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc01Temp> zwKc01Temps = kc01Mapper.selectZwKc01Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc01Temps)) {
                    logger.info("zw_kc01 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc01Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                passDataService.passData(zwKc01Temps, ZwKc01Temp.class, Catalog.kc01, guid);
            }
        } else {
            logger.info("zw_kc01 : 存储过程出错");
        }
    }



    @Override
    public void zwKc99(ConfigEntity configEntity) {
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc99Mapper.ProZwKc99(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            String guid = getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc99Temp> zwKc99Temps = kc99Mapper.selectZwKc99Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc99Temps)) {
                    logger.info("zw_kc99 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc99Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                passDataService.passData(zwKc99Temps, ZwKc99Temp.class, Catalog.kc99, guid);
            }
        } else {
            logger.info("zw_kc99 : 存储过程出错");
        }
    }




    @Override
    public void zwKslw(ConfigEntity configEntity) {
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kslwMapper.ProZwKslw(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            String guid = getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwTemp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKslwTemps)) {
                    logger.info("zw_kslw : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKslwTemps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                passDataService.passData(zwKslwTemps, ZwKslwTemp.class, Catalog.kslw, guid);
            }
        } else {
            logger.info("zw_kslw : 存储过程出错");
        }
    }



    @Override
    public void zwAc43(ConfigEntity configEntity) {
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        //ac43Mapper.ProZwAc43(map);
        map.put("result","1");
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
           // ac43Mapper.ProZwAc43390(map);
            if ("1".equals(map.get("result"))) {
                int pageNo = 1;
                String guid = getGuid();
                for (int i = 1; i <= pageNo; i++) {
                    //分页获取数据
                    PageHelper.startPage(i, 500);
                    List <ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43Temp(configEntity.getAaa027());
                    //判断  集合是否有值
                    if (CollectionUtils.isEmpty(zwAc43Temps)) {
                        logger.info("zw_ac43 : 没有数据更新");
                        break;
                    }
                    //获取页数
                    if (i == 1) {
                        PageInfo pageInfo = new PageInfo(zwAc43Temps);
                        pageNo = pageInfo.getPages();
                    }
                    //多线程跑数据
                     passDataService.passData(zwAc43Temps, ZwAc43Temp.class, Catalog.ac43, guid);
//                    Future <String> result =
 //                   try {
                        //线程返回结果。0为政务接口异常导致的失败，1为传输成功。while死循环直到推送成功跳出，弊端可能出现死循环
//                        while(true) {
//                            if ("0".equals(result.get())) {
//                                passDataService.passData(zwAc43Temps, ZwAc43Temp.class, Catalog.ac43, guid);
//                            }
//                            else{
//                                break;
//                            }
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
                }
            }else{
                logger.info("zw_ac43_390 : 存储过程出错");
            }
        } else {
            logger.info("zw_ac43 : 存储过程出错");
        }
    }




    @Override
    public void zwKc26(ConfigEntity configEntity) {
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map <String, Object> map = new HashMap <>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc26Mapper.ProZwKc26(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            String guid = getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc26Temp> zwKc26Temps = kc26Mapper.selectZwKc26Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc26Temps)) {
                    logger.info("zw_kc26 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc26Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                passDataService.passData(zwKc26Temps, ZwKc26Temp.class, Catalog.kc26, guid);
            }
        } else {
            logger.info("zwKc26 : 存储过程出错");
        }
    }



    public  String getGuid(){
       String guid = null;
        try {
            Client webService = WbClient.getWebService();
            Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");
            guid = invoke[0].toString();
        } catch (Exception e) {
            logger.error("zw_ac01 : 政务平台登入方法报错"+e.toString());
        }
        return guid;
    }



 /*
     //拼接xml格式文件

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
            str.append("error");
        }
        return str.toString();
    }






    //判断返回数据
    public static void delReturnMsg(Object[] objects, Map <String, String> map) {
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



 发送邮件
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

*/





}
