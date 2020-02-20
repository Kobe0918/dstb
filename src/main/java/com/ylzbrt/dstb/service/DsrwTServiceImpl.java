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

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    //  并发，但是接口获取gid下一个会失效
//    @Async
//    @Override
//    public void zwAc01() {
//        String errorMsg = null;
//        StringBuffer str = new StringBuffer();            //拼接xml格式文件传输政务平台
//        Map <String, String> result = new HashMap <>();  //接收异常或政务返回报错信息
//        logger.info("zw_ac01_begin");
//        //调用存储过程
//        Map <String, Object> map = new HashMap <>();
//        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
//        ac01Mapper.ProZwAc01(map);
//
//        //判断存储过程执行结果
//        if ("1".equals(map.get("result"))) {
//            Client webService = WbClient.getWebService();
//
//            int pageNo = 1;
//            for (int i = 1; i <= pageNo; i++) {
//
//                //500条分页获取数据
//                PageHelper.startPage(i, 500);
//                List <ZwAc01> zwAc01s = ac01Mapper.selectZwAC01();
//                //判断集合是否有值
//
//                if (CollectionUtils.isEmpty(zwAc01s)) {
//                    errorMsg = "没有数据更新";
//                    break;
//                }
//                //获取页数
//                if (i == 1) {
//                    PageInfo pageInfo = new PageInfo(zwAc01s);
//                    pageNo = pageInfo.getPages();
//                }
//                //拼接xml文件
//                String xml = concatXml(zwAc01s, ZwAc01.class, str);
//                if ("error".equals(xml)) {
//                    errorMsg = "concatXml错误";
//                    break;
//                }
//                // 传输数据
//                try {
//                    //获取到的gid可行的情况下，传输数据
//                    //推送数据
//                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
//                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
//                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
//                        break;
//                    }else{
//                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.ac01, xml);
//                        //解析返回数据
//                        delReturnMsg(pushXmls, result);
//                    }
//                } catch (Exception e) {
//                    errorMsg =  "sendXml 出现异常";
//                }
//                if (result.get("exception") != null) {
//                    errorMsg =  result.get("exception");
//                    break;
//                }
//                if ("false".equals(result.get("flag"))) {
//                    errorMsg =  result.get("msg");
//                    break;
//                }
//                str.delete(0, str.length());
//            }
//        } else {
//            errorMsg = "存储过程出错";
//        }
//        if (errorMsg == null) {
//            errorMsg = "政务数据更新成功";
//        }
//        /*else{
//           // sendMail("zw_ac01:" +errorMsg);
//        }*/
//        timerMapper.insert(new Timer(new Date(),"zw_ac01","zw_ac01 : " + errorMsg));
//        logger.info("zw_ac01_end");
//    }

   // java -jar C:\Users\Administrator\Desktop\dstb-0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:oracle:thin:@172.16.3.131:1521:ybjh1 --spring.datasource.username=ybjhcx --spring.datasource.password=ybjhcx#2019
   /* @Async
    @Override
    public void zwKa08() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        logger.info("zw_ka08_begin");
        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08Temp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKa08Temps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKa08Temps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwKa08Temps, ZwKa08Temp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.ka08, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
            // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_ka08","zw_ka08 : " + errorMsg));
        logger.info("zw_ka08_end");
    }*/
   @Autowired
   private PassDataService passDataService;


   @Override
   public void zwAc01(){
       //执行存储过程   ****测试占时调用ac01 返回 1
       Map <String, Object> map = new HashMap <>();
       map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
       ac01Mapper.ProZwAc01(map);
       //判断存储过程执行结果
       if ("1".equals(map.get("result"))) {
           int pageNo = 1;
           String guid = null;
           try {
               Client webService = WbClient.getWebService();
               Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");
               guid = invoke[0].toString();
           } catch (Exception e) {
               logger.error("zw_ac01 : 政务平台登入方法报错"+e.toString());
           }
           for (int i = 1; i <= pageNo; i++) {
               //分页获取数据
               PageHelper.startPage(i, 500);
               List <ZwAc01>  zwAC01List = ac01Mapper.selectZwAC01();
               //判断  集合是否有值
               if (CollectionUtils.isEmpty(zwAC01List)) {
                   logger.info("zw_ac01 : 没有数据更新");
                  // timerMapper.insert(new Timer(new Date(),"zw_ac01","zw_ac01 : 没有数据更新" ));
                   break;
               }
               //获取页数
               if (i == 1) {
                   PageInfo pageInfo = new PageInfo(zwAC01List);
                   pageNo = pageInfo.getPages();
               }
               //多线程跑数据
               passDataService.passData(zwAC01List,ZwAc01.class,Catalog.ac01,guid);
           }
       } else {
           logger.info("zw_ac01 : 存储过程出错");
       // timerMapper.insert(new Timer(new Date(),"zw_ac01","zw_ac01 : 存储过程出错" ));
    }
   }


    @Override
    public void zwKa08() {
        logger.info("zw_ka08_begin");
        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());
        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
                int pageNo = 1;
                String guid=null;
            try {
                Client webService = WbClient.getWebService();
                Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");
                guid = invoke[0].toString();
            } catch (Exception e) {
                logger.error("zw_ka08 : 政务平台登入方法报错"+e.toString());
            }
                for (int i = 1; i <= pageNo; i++) {
                    //分页获取数据
                    PageHelper.startPage(i, 500);
                    List <ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08Temp();

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

    @Async
    @Override
    public void zwKc01() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_kc01 ");

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc01Temp> zwKc01Temps = kc01Mapper.selectZwKc01Temp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc01Temps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc01Temps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwKc01Temps, ZwKc01Temp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.kc01, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
        // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_kc01","zw_kc01 : " + errorMsg));
        System.out.println("结束zw_kc01");
    }


    @Async
    @Override
    public void zwKc99() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_kc99 ");

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc99Temp> zwKc99Temps = kc99Mapper.selectZwKc99Temp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc99Temps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc99Temps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwKc99Temps, ZwKc99Temp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.kc99, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
        // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_kc99","zw_kc99 : " + errorMsg));
        System.out.println("结束zw_kc99");
    }



    @Async
    @Override
    public void zwKslw() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_kslw ");

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwTemp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKslwTemps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKslwTemps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwKslwTemps, ZwKslwTemp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.kslw, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
        // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_kslw","zw_kslw : " + errorMsg));
        System.out.println("结束zw_kslw");
    }


    @Async
    @Override
    public void zwAc43() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_ac43 ");

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43Temp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwAc43Temps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwAc43Temps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwAc43Temps, ZwAc43Temp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.ac43, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
        // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_ac43","zw_ac43 : " + errorMsg));
        System.out.println("结束zw_ac43");
    }



    @Async
    @Override
    public void zwKc26() {
        String errorMsg = null;
        //拼接xml格式文件传输政务平台
        StringBuffer str = new StringBuffer();
        //接收异常或政务返回报错信息
        Map <String, String> result = new HashMap <>();
        System.out.println("开始 -- zw_kc26 ");

        //调用存储过程
        Map <String, Object> map = new HashMap <>();
        map.put("updator", DynamicScheduleTask.configEntity.getUpdator());

        //执行存储过程   ****测试占时调用ac01 返回 1
        ac01Mapper.ProZwAc01(map);
        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            Client webService = WbClient.getWebService();
            int pageNo = 1;
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List <ZwKc26Temp> zwKc26Temps = kc26Mapper.selectZwKc26Temp();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc26Temps)) {
                    errorMsg = "没有数据更新";
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc26Temps);
                    pageNo = pageInfo.getPages();
                }
                //拼接xml文件
                String xml = concatXml(zwKc26Temps, ZwKc26Temp.class, str);
                if ("error".equals(xml)) {
                    errorMsg = "concatXml错误";
                    break;
                }

                // 传输数据
                try {
                    //获取到的gid可行的情况下，传输数据
                    //推送数据
                    Object[] invoke = webService.invoke("LoginByAccount", DynamicScheduleTask.configEntity.getZw_account(), DynamicScheduleTask.configEntity.getZw_pwd());
                    if ("err".equalsIgnoreCase(invoke[0].toString())) {
                        errorMsg =  "政务登入报错，有可能账号密码配错，数据库中。";
                        break;
                    }else {
                        Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.kc26, xml);
                        //解析返回数据
                        delReturnMsg(pushXmls, result);
                    }
                } catch (Exception e) {
                    errorMsg =  "sendXml 出现异常";
                    break;
                }
                if (result.get("exception") != null) {
                    errorMsg =  result.get("exception");
                    break;
                }
                if ("false".equals(result.get("flag"))) {
                    errorMsg =  result.get("msg");
                    break;
                }
                str.delete(0, str.length());
            }
        } else {
            errorMsg = "存储过程出错";
        }
        if (errorMsg == null) {
            errorMsg = "政务数据更新成功";
        }
        //else{
        // sendMail("zw_ac01:" +errorMsg);
        //}
        timerMapper.insert(new Timer(new Date(),"zw_kc26","zw_kc26 : " + errorMsg));
        System.out.println("结束zw_kc26");
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





    public static void main(String[] args){
        if("err".equalsIgnoreCase("ERR:".toString().substring(0,3))){
            System.out.println("牛");
        }

        Client webService = WbClient.getWebService();
        String errorMsg =null;
        Map<String,String> result = new HashMap();
        try {
            Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");
            Object[] invoke1 = webService.invoke("LoginByAccount", "ybjybxx_hjpt","sdo@1108");

            System.out.println(invoke1[0].toString());

                System.out.println("1");
                Object[] pushXmls = webService.invoke("pushXml", invoke[0].toString(), Catalog.ka08, "sssss");
                //解析返回数据
                delReturnMsg(pushXmls, result);
                if (result.get("exception") != null) {
                    errorMsg = result.get("exception");
                }
                if ("false".equals(result.get("flag"))) {
                    System.out.println("2");
                    errorMsg =  result.get("msg");
                }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(errorMsg + ": 结果");
        }

    }

}
