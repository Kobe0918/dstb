package com.ylzbrt.dstb.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * @Author: guozy
 * @Description:
 * @Date:Created in  2020/1/1
 * @Modified By:
 */

public class WbClient {


    public static Client getWebService() {

        //16.37  06f3f2a4-5c7a-4b1a-9df7-a03f30c75fb6
        //17.07  e9497ef9-17ef-4c02-8585-fdc39ba181ae
        JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();
        Client client = dcflient.createClient("http://172.16.18.207:806/Convergence/webservice/ConvergenceService?wsdl");
        //"http://172.16.18.207:806/Convergence/webservice/ConvergenceService?wsdl 正式
        //"http://120.35.29.217:809/Convergence/webservice/ConvergenceService?wsdl" 测试
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(60 * 1000); //连接超时时间
        policy.setReceiveTimeout(3 * 60 * 1000);//请求超时时间.
        conduit.setClient(policy);
        return client;
    }

    public static void main(String[] args) throws Exception {
        Client client = getWebService();
        Object[] guidObjects = client.invoke("LoginByAccount", new Object[]{"ybjybxx_hjpt", "sdo@1108"});
        System.out.println(guidObjects[0].toString());
    }


}
