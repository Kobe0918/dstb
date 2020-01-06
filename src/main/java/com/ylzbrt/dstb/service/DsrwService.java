package com.ylzbrt.dstb.service;


import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.dao.ZwKb01Mapper;
import com.ylzbrt.dstb.dao.ZwQslwFwwdb0Mapper;
import com.ylzbrt.dstb.entity.ZwKb01;
import com.ylzbrt.dstb.entity.ZwQslwFwwdb0;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;


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
    @Async
    @Scheduled(cron = "0 0/1 9-23 ? * *")  //间隔1秒
   public void dealKb01()throws Exception{
     /*
        第一步：调用存储过程 获得执行结果
        第二步；判断更新结果，需要更新则调用查询，推送数据，否则不执行。
        第三步：插入定时器执行日志。

     */
     //第一步：

     //第二步：
            Client client = WbClient.getWebService();

       List<ZwKb01> list = zwKb01Mapper.selectByExample(null);
       // 数据量
       int size = list.size();
       //记录下标
        int index = 0 ;

        //每500条提交一次
        for (int i = 1; i <= (size%500 > 0?size/500+1:size/500); i++) {
            //头部
            String sb ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<table>";
            //500条数据的拼接成row格式
            for (int j = 1; j <= (size - i*500 > 0 ?500:size-(i-1)*500); j++) {
                sb = sb + "<row type=\"add\">" +
                        "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA[" + list.get(index).getSsqy00() + "]]></ssqy00>" +
                        "<akb020 name=\"网点编号\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb020() + "]]></akb020>" +
                        "<akb021 name=\"网点名称\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb021() + "]]></akb021>" +
                        "<akb022 name=\"类别\" isattachment=\"false\"><![CDATA[" + list.get(index).getAkb022() + "]]></akb022>" +
                        "<aae006 name=\"地址\" isattachment=\"false\"><![CDATA[" + list.get(index).getAae006() + "]]></aae006>" +
                        "<fsfzx0 name=\"所属分中心\" isattachment=\"false\"><![CDATA[" + list.get(index).getFsfzx0() + "]]></fsfzx0>" +
                        "</row>";
            }
            //xml尾部
            sb = sb+  "</table>";
            //获取Gid
            Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            System.out.println("获取guid：" + guidObjects[0].toString());
            //推送至政务外网
            Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.kb01, sb);
            //输出调用结果，Object数组第一条数据为返回结果
            System.out.println("调用结果1:" + objects[0].toString());
            //初始化xml拼接
            sb ="";
        }
   }
    @Async
    @Scheduled(cron = "0 0/10 9-23 ? * *")  //间隔1秒
    public void dealQslwFwwdb0() throws Exception {
        //第一步：

        //第二步：
        Client client = WbClient.getWebService();

        List<ZwQslwFwwdb0> list = zwQslwFwwdb0Mapper.selectByExample(null);
        // 数据量
        int size = list.size();
        //记录下标
        int index = 0 ;


        //每500条提交一次
        for (int i = 1; i <= (size%500 > 0?size/500+1:size/500); i++) {
            //头部
            String sb ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<table>";
            //500条数据的拼接成row格式
            for (int j = 1; j <= (size - i*500 > 0 ?500:size-(i-1)*500); j++) {
                sb = sb + "<row type=\"add\">" +
                        "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA["+list.get(index).getSsqy00()+"]]></ssqy00>" +
                        "<fwwdbh name=\"网点编号\" isattachment=\"false\"><![CDATA["+list.get(index).getFwwdbh()+"]]></fwwdbh>" +
                        "<fwwdmc name=\"网点名称\" isattachment=\"false\"><![CDATA["+list.get(index).getFwwdmc()+"]]></fwwdmc>" +
                        "<wdlb00 name=\"类别\" isattachment=\"false\"><![CDATA["+list.get(index).getWdlb00()+"]]></wdlb00>" +
                        "<wddz00 name=\"地址\" isattachment=\"false\"><![CDATA["+list.get(index).getWddz00()+"]]></wddz00>" +
                        "<fzxmc0 name=\"所属医保中心\" isattachment=\"false\"><![CDATA["+list.get(index).getFzxmc0()+"]]></fzxmc0>" +
                        "</row>";
            }
            //xml尾部
            sb = sb+  "</table>";
            Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            System.out.println("获取guid：" + guidObjects[0].toString());
            //推送至政务外网
            Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), Catalog.qslwfwwdb0, sb);
            //输出调用结果，Object数组第一条数据为返回结果
            System.out.println("调用结果2:" + objects[0].toString());
            //初始化xml拼接
            sb ="";
        }
    }

    public static void main(String[] args) {
        int size = 1000;
        System.out.println(size);
        int index = 0;
        for (int i = 1; i <= (size%500 > 0?size/500+1:size/500); i++) {

            for (int j = 1; j <= (size - i*500 > 0 ?500:size-(i-1)*500); j++) {
                index += 1;
                System.out.println("执行次数：" + j);
            }
            System.out.println("-----------------提交次数："+i +",总数："+(index+1));
        }
    }

}

