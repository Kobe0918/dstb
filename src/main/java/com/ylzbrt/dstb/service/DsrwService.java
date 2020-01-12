package com.ylzbrt.dstb.service;


import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.common.Utils;
import com.ylzbrt.dstb.dao.*;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author:
 * @Description:
 * @Date:Created in  2020/1/5
 * @Modified By:
 */
@Service
@EnableScheduling
@EnableAsync
public class DsrwService {
   @Autowired
    private ZwKb01Mapper zwKb01Mapper;
   @Autowired
   private ZwQslwFwwdb0Mapper zwQslwFwwdb0Mapper;
   @Autowired
   private ZwKa02Mapper zwKa02Mapper;
   @Autowired
   private ZwKa17YpMapper zwKa17YpMapper;
    @Autowired
    private ZwKa03Mapper zwKa03Mapper;
    @Autowired
    private ZwKa17Mapper zwKa17Mapper;
    @Autowired
    private ZwKY65Mapper zwKY65Mapper;
    @Autowired
    private KY70Mapper ky70Mapper;
    @Autowired
    private MY56Mapper my56Mapper;
    @Autowired
    private ZwMc01Mapper zwMc01Mapper;
    @Autowired
    private ZwMc03Mapper zwMc03Mapper;
    @Autowired
    private ZwMca1Mapper zwMca1Mapper;
    @Autowired
    private TimerMapper timerMapper;

    /**
     *  定点医疗机构和药店
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)  //间隔200秒
   public void dealKb01(){
     /*
        第一步：1.in case 备份上次更新数据 调用存储过程 获得执行结果
        第二步；判断更新结果，需要更新则调用查询，推送数据，否则不执行。
        第三步：插入定时器执行日志。

     */
        String log = log = "推送成功";
        boolean flag = true;
     try {
         //第一步：
         Map <String, Object> map = new HashMap <String, Object>();
         map.put("UPDATOR", "定时器");
         zwKb01Mapper.accessPro(map);
         // 存储过程正常
         // map.get("code")  替换 "1"
         if ("1".equals(map.get("code")))
         {
             List <ZwKb01> list = zwKb01Mapper.selectByExample(null);
             if (list.size() > 0) {
                 //第二步：
                 Client client = WbClient.getWebService();
                 // 数据量
                 int size = list.size();
                 //记录下标
                 int index = 0;
                 //每500条提交一次
                 for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                     //头部
                     String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                             "<table>";
                     //500条数据的拼接成row格式
                     for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                         sb = sb + "<row type=\"add\">" +
                                 "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA[" + list.get(index).getSsqy00() + "]]></ssqy00>" +
                                 "<akb020 name=\"网点编号\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb020() + "]]></akb020>" +
                                 "<akb021 name=\"网点名称\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb021() + "]]></akb021>" +
                                 "<akb022 name=\"类别\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb022() + "]]></akb022>" +
                                 "<aae006 name=\"地址\" isattachment=\"false\"><![CDATA[" + list.get(index).getAae006() + "]]></aae006>" +
                                 "<fsfzx0 name=\"所属分中心\" isattachment=\"false\"><![CDATA[" + list.get(index).getFsfzx0() + "]]></fsfzx0>" +
                                 "</row>";
                         index++;
                     }
                     //xml尾部
                     sb = sb + "</table>";
                     //获取Gid
                     Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                     System.out.println("获取guid：" + guidObjects[0].toString());
                     //推送至政务外网
                     Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.kb01, sb);
                     if("false".equals(Utils.getPushMsg(objects[0].toString())))
                     {
                         flag = false;
                         break;
                     }
                     //初始化xml拼接
                     sb = "";

                 }
             }else
             {
                 log = "没有更新数据";
             }
         }else
         {
             log = "存储过程执行出错";
             flag = false;
         }
     }catch (Exception e)
     {
         log = "定时器服务异常:"+e.getMessage();
         flag = false;
     }finally {
         if(flag)
         {

         }
         //插入日志/推送信息
         timerMapper.insert(new Timer(new Date(),"定点医疗机构和药店-kb01",log));
         System.out.println("定点医疗机构和药店--插入日志 "+log);
     }
   }

    /**
     * 全省联网定点医疗机构和药店-QslwFwwdb0
     */
   @Async
    @Scheduled(fixedRate = Catalog.fixedRate)  //间隔200秒
    public void dealQslwFwwdb0()   {

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwQslwFwwdb0Mapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code"))) {
                //第二步：
                List <ZwQslwFwwdb0> list = zwQslwFwwdb0Mapper.selectByExample(null);
                if (list.size() > 0) {
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb + "<row type=\"add\">" +
                                    "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA[" + list.get(index).getSsqy00() + "]]></ssqy00>" +
                                    "<fwwdbh name=\"网点编号\" isattachment=\"false\"><![CDATA[" + list.get(index).getFwwdbh() + "]]></fwwdbh>" +
                                    "<fwwdmc name=\"网点名称\" isattachment=\"false\"><![CDATA[" + list.get(index).getFwwdmc() + "]]></fwwdmc>" +
                                    "<wdlb00 name=\"类别\" isattachment=\"false\"><![CDATA[" + list.get(index).getWdlb00() + "]]></wdlb00>" +
                                    "<wddz00 name=\"地址\" isattachment=\"false\"><![CDATA[" + list.get(index).getWddz00() + "]]></wddz00>" +
                                    "<fzxmc0 name=\"所属医保中心\" isattachment=\"false\"><![CDATA[" + list.get(index).getFzxmc0() + "]]></fzxmc0>" +
                                    "</row>";
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        System.out.println("获取guid：" + guidObjects[0].toString());
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.qslwfwwdb0, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            break;
                        }
                        //输出调用结果，Object数组第一条数据为返回结果
                        System.out.println(flag+" 调用结果1:" + objects[0].toString());
                        //初始化xml拼接
                        sb = "";
                    }
                } else {
                    log = "没有更新数据";
                }
            } else {
                log = "存储过程执行出错";
                flag = false;
            }
        } catch (Exception e) {
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        } finally {
            if(flag)
            {

            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"全省联网定点医疗机构和药店-QslwFwwdb0",log));
            System.out.println("全省联网定点医疗机构和药店--插入日志 "+log);

        }
    }

    /**
     *  药品目录
     * @throws Exception
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa02()  {

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwKa02Mapper.accessPro(map);
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))
            {
                List <ZwKa02> list = zwKa02Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        System.out.println("获取guid：" + guidObjects[0].toString());
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ka02, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            break;
                        }
                        //输出调用结果，Object数组第一条数据为返回结果
                        System.out.println(flag+" 调用结果1:" + objects[0].toString());
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                log = "存储过程执行出错";
                flag = false;
            }
        }catch (Exception e)
        {
            log = "定时器服务异常:"+e.getMessage();
            flag = false;
        }finally {
            if(flag)
            {

            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"药品目录-ka02",log));
            System.out.println("药品目录--插入日志 "+log);
        }
    }
    /**
     *  特殊药品目录-ka17_yp
     * @throws Exception
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa17Yp() {

        String log = log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwKa17YpMapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            //   替换 "1"
            if ("1".equals(map.get("code")))
            {
                List <ZwKa17Yp> list = zwKa17YpMapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++)
                    {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++)
                        {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        System.out.println("获取guid：" + guidObjects[0].toString());
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ka17_yp, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                flag = false;
                log = "存储过程执行出错";
            }
        }catch (Exception e)
        {
            flag = false;
            log = "定时器服务异常:"+e.getMessage();
        }finally {
            if(flag)
            {

            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"特殊药品目录-ka17_yp",log));
            System.out.println("特殊药品目录-ka17_yp 插入日志 "+log);
        }

    }

    /**
     *  诊疗目录-ka03
     * @throws Exception
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa03()   {
        String log = "";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
              zwKa03Mapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            //   替换 "1"
            if ("1".equals(map.get("code")))
            {
                List <ZwKa03> list = zwKa03Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
//                        System.out.println("获取guid：" + guidObjects[0].toString());
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ka03, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            break;
                        }
                        //输出调用结果，Object数组第一条数据为返回结果
//                        System.out.println(flag+" 调用结果1:" + objects[0].toString());
                        //初始化xml拼接
                        sb = "";

                    }
                    log = "推送成功";
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                flag = false;
                log = "存储过程执行出错";

            }
        }catch (Exception e)
        {
            flag = false;
            log = "定时器服务异常:"+e.getMessage();

        }finally {
            //插入日志/推送信息 诊疗目录-ka03
            timerMapper.insert(new Timer(new Date(),"诊疗目录-ka03",log));
            System.out.println("诊疗目录-ka03 插入日志 "+log);
        }
    }

    /**
     *  特殊病种诊疗目录-ka17
     * @throws Exception
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa17()   {

        String  log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwKa17Mapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))//测试存储过程时要修改
            {
                List <ZwKa17> list = zwKa17Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ka17, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            break;
                        }
                        //初始化xml拼接
                        sb = "";
                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                flag = false;
                log = "存储过程执行出错";

            }
        }catch (Exception e)
        {
            flag = false;
            log = "定时器服务异常:"+e.getMessage();

        }finally {
                if(flag)
                {

                }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"特殊病种诊疗目录-ka17",log));
            System.out.println("特殊病种诊疗目录-ka17 插入日志 "+log);
        }
    }

    /**
     * 职工个人权益单-ky65
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKy65(){

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
             map.put("AAA027_","350000");
            zwKY65Mapper.accessPro(map);
            // 存储过程正常
            if ("1".equals(map.get("code")))
            {
                List <ZwKY65> list =  zwKY65Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
//                        System.out.println("获取guid：" + guidObjects[0].toString());
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ky65, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            //获取错误信息
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                flag = false;
                log = "存储过程执行出错";

            }
        }catch (Exception e)
        {
            flag = false;
            log = "定时器服务异常:"+e.getMessage();

        }finally {
            if(flag)
            {

            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"职工个人权益单-ky65",log));
            System.out.println("职工个人权益单-ky65 插入日志 "+log);
        }
    }

    /**
     * 生育产前登记-Mc01
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMc01(){

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwMc01Mapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))
            {
                List <ZwMc01> list = zwMc01Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.mc01, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                flag=false;
                log = "存储过程执行出错";

            }
        }catch (Exception e)
        {
            flag=false;
            log = "定时器服务异常:"+e.getMessage();

        }finally {
            if(flag)
            {

            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"生育产前登记-Mc01",log));
            System.out.println("生育产前登记-Mc01 插入日志 "+log);
        }
    }

    /**
     * 生育保险刷卡记录-Ky70
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKy70(){

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map<String, Object> map = new HashMap<String, Object>();
             map.put("UPDATOR", "定时器");
             map.put("code","");
              ky70Mapper.accessPro(map);
//             存储过程正常执行  //测试存储过程时要修改
            if ("1".equals(map.get("code")))
            {
                List <KY70> list = ky70Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {

                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.ky70, sb);
                        System.out.println(index+","+sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据数据";
                }
            }else
            {
                flag = false;
                log = "存储过程执行出错";

            }
        }catch (Exception e)
        {
            flag = false;
            log = "定时器服务异常:"+e.getMessage();

        }finally {
            timerMapper.insert(new Timer(new Date(),"生育保险刷卡记录-Ky70",log));
            //插入日志/推送信息
            System.out.println("生育保险刷卡记录-Ky70 插入日志 "+log);
        }
    }

    /**
     *  生育登记信息-Mca1
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMca1(){

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
             map.put("code","");
              zwMca1Mapper.accessPro(map);
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))
            {
                List <ZwMca1> list = zwMca1Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.mca1, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新数据";
                }
            }else
            {
                log = "存储过程执行出错";
                flag = false;
            }
        }catch (Exception e)
        {
            log = "定时器服务异常:"+e.getMessage();
            flag = false;
        }finally {
            timerMapper.insert(new Timer(new Date(),"生育登记信息-Mca1",log));
            //插入日志/推送信息
            System.out.println("生育登记信息-Mca1 插入日志 "+log);
        }
    }

    /**
     *  生育待遇发放信息-Mc03
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
        public void dealMc03(){

        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
             map.put("UPDATOR", "定时器");
            zwMc03Mapper.accessPro(map);
//              System.out.println(map.get("code"));
            // 存储过程正常
            //   替换 "1"  map.get("code")
            if ("1".equals(map.get("code")))
            {
                List <ZwMc03> list = zwMc03Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++)
                    {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++)
                        {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.mc03, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";

                    }
                }else
                {
                    log = "没有更新的数据";
                }
            }else
            {
                log = "存储过程执行出错";
                flag = false;
            }
        }catch (Exception e)
        {
            log = "定时器服务异常:"+e.getMessage();
            flag = false;
        }finally {

            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"生育待遇发放信息-Mc03",log));
            System.out.println("生育待遇发放信息-Mc03 插入日志 "+log);
        }
    }

    /**
     *  生育保险个人权益单-My56
     */
    @Async
    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMy56(){
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
              Map <String, Object> map = new HashMap <String, Object>();
            map.put("UPDATOR", "定时器");
            my56Mapper.accessPro(map);
            //  System.out.println(map.get("code"));
            // 存储过程正常
            if ("1".equals(map.get("code")))
            {
                List <MY56> list = my56Mapper.selectByExample(null);
                if (list.size() > 0) {
                    //第二步：
                    Client client = WbClient.getWebService();
                    // 数据量
                    int size = list.size();
                    //记录下标
                    int index = 0;
                    //每500条提交一次
                    for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++)
                    {
                        //头部
                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                                "<table>";
                        //500条数据的拼接成row格式
                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
                            sb = sb +Utils.getXml(list.get(index));
                            index++;
                        }
                        //xml尾部
                        sb = sb + "</table>";
                        System.out.println(sb);
                        //获取Gid
                        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
                        //推送至政务外网
                        Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.my56, sb);
                        if("false".equals(Utils.getPushMsg(objects[0].toString())))
                        {
                            flag = false;
                            log = objects[0].toString();
                            break;
                        }
                        //初始化xml拼接
                        sb = "";
                    }
                }else
                {
                    log = "没有更新的数据";
                }
            }else
            {
                log = "存储过程执行出错";
                flag = false;
            }
        }catch (Exception e)
        {
            log = "生育保险个人权益单-My56 定时器服务异常:"+e.getMessage();
            flag = false;
        }finally {

            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(),"生育保险个人权益单-My56",log));
            System.out.println("生育保险个人权益单-My56 插入日志 "+log);
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
       /* Client client = WbClient.getWebService();
        try {
            Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            System.out.println(guidObjects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        /*int size = 1000;
        System.out.println(size);
        int index = 0;
        for (int i = 1; i <= (size%500 > 0?size/500+1:size/500); i++) {

            for (int j = 1; j <= (size - i*500 > 0 ?500:size-(i-1)*500); j++) {
                index += 1;
                System.out.println("执行次数：" + j);
            }
            System.out.println("-----------------提交次数："+i +",总数："+(index+1));
        }*/

    /*   测试解析xml回复信息
        StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<Response><flag>true</flag><msg>操作成功</msg></Response>");
        // step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
        DocumentBuilderFactory factory = DocumentBuilderFactory
                .newInstance();
        // step 2:获得具体的dom解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        // step3: 解析一个xml文档，获得Document对象（根结点）
        Document doc = builder.parse(new InputSource((new StringReader(sb.toString()))));

        NodeList list = doc.getElementsByTagName("flag");
        Node book = list.item(0);
        if(book.getFirstChild().getNodeValue().equals("true"))
        {
            System.out.println("yes");
        }
        System.out.println(book.getFirstChild().getNodeValue());
        */
    //获取类的变量和名称
       /* ZwKa02 zwKa02 =new ZwKa02();
        zwKa02.setAka060("123");
        System.out.println(Utils.getXml(zwKa02));*/

    }

}

