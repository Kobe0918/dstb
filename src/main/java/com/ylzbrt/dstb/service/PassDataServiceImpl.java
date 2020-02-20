package com.ylzbrt.dstb.service;

import com.ylzbrt.dstb.dao.TimerMapper;
import com.ylzbrt.dstb.dsrw.DynamicScheduleTask;
import com.ylzbrt.dstb.entity.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-02-12 21:20
 * @Description: ${Description}
 */
@Service
public class PassDataServiceImpl implements PassDataService {

    @Autowired
    private TimerMapper timerMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Async(value="asyncServiceExecutor")
    @Override
    public void  passData(List <?> ob, Class <?> cl,String catalog,String guid){
        //拼接数据
        StringBuffer str = new StringBuffer();
        try {
            str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<table>");
            for (int i = 0; i < ob.size(); i++) {
                str.append("<row type=\"add\">");
                Field[] declaredFields = cl.getDeclaredFields();
                for (Field f : declaredFields) {
                    f.setAccessible(true);
                    str.append("<" + f.getName() + " name=\"" + f.getAnnotation(com.ylzbrt.dstb.util.FieldsAnnotation.class).value() + "\" isattachment=\"false\"><![CDATA[" + f.get(ob.get(i)) + "]]></" + f.getName() + ">");
                }
                str.append("</row>");
            }
            str.append("</table>");
        } catch (IllegalAccessException e) {
            logger.error(cl.getSimpleName() + ":" + e.toString());
        }

            // 传输数据
            try {
                Object[] pushXmls = DynamicScheduleTask.client.invoke("pushXml", guid, catalog, str.toString());
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
                if ("false".equals(valueFlag)) {
                    logger.error(cl.getSimpleName()+ " : "+valueMsg);
                   // timerMapper.insert(new Timer(new Date(),cl.getSimpleName(),cl.getSimpleName() + valueMsg));
                }
                logger.info(valueMsg);
            } catch (Exception e) {
                logger.error(cl.getSimpleName() + " : 政务传输数据接口异常");
                //timerMapper.insert(new Timer(new Date(),cl.getSimpleName(),cl.getSimpleName() + "政务传输数据接口异常"));
            }
        }


}
