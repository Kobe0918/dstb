package com.ylzbrt.dstb.common;

import com.ylzbrt.dstb.dsrw.DynamicScheduleTask;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Properties;

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

    //实现JavaMailSender，自定义邮件发送器
    public static  JavaMailSenderImpl makeMail() {
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
    public static void  sendMail(String errorMsg) {
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
