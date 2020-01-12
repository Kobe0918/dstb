package com.ylzbrt.dstb.common;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;

/**
 * @Author:
 * @Description:
 * @Date:Created in  2020/1/9
 * @Modified By:
 */
public class Utils {
    /**
     * 获取推送后反馈信息
     * @param msg
     * @return
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static String getPushMsg(String msg) throws ParserConfigurationException, IOException, SAXException {
        // step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
        DocumentBuilderFactory factory = DocumentBuilderFactory
                .newInstance();
        // step 2:获得具体的dom解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        // step3: 解析一个xml文档，获得Document对象（根结点）
        Document doc = builder.parse(new InputSource((new StringReader(msg))));

        NodeList list = doc.getElementsByTagName("flag");
        Node book = list.item(0);
        System.out.println("返回结果:"+book.getFirstChild().getNodeValue());
        return book.getFirstChild().getNodeValue();
    }

    public static String getXml(Object object){
        String s = "<row type=\"add\">";
        //获取类的变量声明信息
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field f:fields)
        {
            f.setAccessible(true);
            try {
                s += "<"+f.getName()+" name=\""+f.getAnnotation(Name.class).value()+"\" isattachment=\"false\"><![CDATA["+f.get(object)+"]]></"+f.getName()+">";
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        s += "</row>";
        return  s;
    }

}
