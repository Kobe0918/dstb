package com.ylzbrt.dstb.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @Author: guozy
 * @Description:
 * @Date:Created in  2020/1/1
 * @Modified By:
 */
public  class WbClient {

    public static Client getWebService(){
        JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();

        Client client = dcflient.createClient("http://120.35.29.217:809/Convergence/webservice/ConvergenceService?wsdl");
        return client;
    }

    public static void main(String[] args) throws Exception {
        Client client = WbClient.getWebService();
        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
        System.out.println("获取guid：" + guidObjects[0].toString());

    }

        /*try {
            JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();

            Client client = dcflient.createClient("http://120.35.29.217:809/Convergence/webservice/ConvergenceService?wsdl");
            StringBuffer sb = new StringBuffer();
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<table>" +
                    "<row type=\"add\">" +
                    "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA[350500]]></ssqy00>" +
                    "<akb020 name=\"网点编号\" isattachment=\"false\"><![CDATA[3505255756]]></akb020>" +
                    "<akb021 name=\"网点名称\" isattachment=\"false\"><![CDATA[test]]></akb021>" +
                    "<akb022 name=\"类别\" isattachment=\"false\"><![CDATA[05]]></akb022>" +
                    "<aae006 name=\"地址\" isattachment=\"false\"><![CDATA[test永春县湖洋镇白云村洋岸91号]]></aae006>" +
                    "<fsfzx0 name=\"所属分中心\" isattachment=\"false\"><![CDATA[test]]></fsfzx0>" +
                    "</row>" +
                    "<row type=\"add\">" +
                    "<ssqy00 name=\"所属区域\" isattachment=\"false\"><![CDATA[350500]]></ssqy00>" +
                    "<akb020 name=\"网点编号\" isattachment=\"false\"><![CDATA[3505255756]]></akb020>" +
                    "<akb021 name=\"网点名称\" isattachment=\"false\"><![CDATA[test]]></akb021>" +
                    "<akb022 name=\"类别\" isattachment=\"false\"><![CDATA[05]]></akb022>" +
                    "<aae006 name=\"地址\" isattachment=\"false\"><![CDATA[test2永春县湖洋镇白云村洋岸91号]]></aae006>" +
                    "<fsfzx0 name=\"所属分中心\" isattachment=\"false\"><![CDATA[test2]]></fsfzx0>" +
                    "</row>" +
                    "</table>")  ;
            Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            System.out.println("获取guid：" + guidObjects[0].toString());
            Object[] objects = client.invoke("pushXml", guidObjects[0].toString(), "WEB2381", sb.toString());
            //输出调用结果，Object数组第一条数据为返回结果
            System.out.println("调用结果:" + objects[0].toString());
        }catch (Exception e){
            e.printStackTrace();
        }*/


}