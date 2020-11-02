package com.ylzbrt.dstb.common;

import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;

public class GetGuidTools {

    public static String TOKEN = null;

    /**
     * 登入政务平台获取 guid进行数据传输,加锁，保证多线程guid一致
     */
    public synchronized static String getGuid() throws Exception {
        String guid = null;
        while (true) {
            Client webService = WbClient.getWebService();
            Object[] invoke = webService.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            guid = invoke[0].toString();
            if (!guid.contains("ERR") && !guid.contains("false")) {
                System.out.println(guid);
                break;
            } else {
                throw new Exception("政务平台LoginByAccount接口账号密码登入返回：" + guid);
            }
        }
        return guid;
    }
}
