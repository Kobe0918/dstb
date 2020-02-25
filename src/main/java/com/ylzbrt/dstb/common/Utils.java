package com.ylzbrt.dstb.common;

import com.ylzbrt.dstb.dsrw.DynamicScheduleTask;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
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
import java.io.*;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;

/**
 * @Author:
 * @Description:
 * @Date:Created in  2020/1/9
 * @Modified By:
 */
public class Utils {
    public static void main(String[] args) {
        String msg = "  sdfdsaf   ";
        System.out.println(getGuidMsg(msg));

    }
    /**
     * 获取推送后反馈信息
     *
     * @param msg
     * @return
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static String getPushMsg(String msg) {
//      访问政务的接口没有错误
            String res = "";
            // step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory
                        .newInstance();
                // step 2:获得具体的dom解析器
                DocumentBuilder builder = factory.newDocumentBuilder();
                // step3: 解析一个xml文档，获得Document对象（根结点）
                Document doc = builder.parse(new InputSource((new StringReader(msg))));

                NodeList list = doc.getElementsByTagName("flag");
                Node book = list.item(0);
                System.out.println("推送政务数据接口返回结果:" + book.getFirstChild().getNodeValue());
                res = book.getFirstChild().getNodeValue();
            } catch (Exception e) {
                res = "dom解析器出错（程序内部问题)";
            }
                return res;
    }

    /**
     *  访问政务账号接口返回信息  判断状态
     * @param msg
     * @return
     */
    public static Boolean getGuidMsg(String msg)
    {
        msg = msg.toLowerCase();
        return (!msg.contains("err")&&!msg.contains("false"));
    }

    public static String getXml(Object object,String option) {
        String s = "<row type=\""+option+"\">";
        //获取类的变量声明信息
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                s += "<" + f.getName() + " name=\"" + f.getAnnotation(Name.class).value() + "\" isattachment=\"false\"><![CDATA[" + f.get(object) + "]]></" + f.getName() + ">";
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        s += "</row>";
        return s;
    }

    //实现JavaMailSender，自定义邮件发送器
    public static JavaMailSenderImpl makeMail() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(DynamicScheduleTask.configEntityOne.getHost());
        mailSender.setUsername(DynamicScheduleTask.configEntityOne.getMailSender());
        mailSender.setPassword(DynamicScheduleTask.configEntityOne.getPwd());
        mailSender.setDefaultEncoding("UTF-8");
        Properties p = new Properties();
        p.setProperty("mail.smtp.auth", "true");
        mailSender.setJavaMailProperties(p);
        return mailSender;
    }

    //发邮件
    public static void sendMail(String errorMsg) {
        MimeMessage mimeMessage = makeMail().createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
            messageHelper.setFrom(DynamicScheduleTask.configEntityOne.getMailSender(), "定时更新政务数据");
            messageHelper.setTo(DynamicScheduleTask.configEntityOne.getMailReceiver());
            messageHelper.setSubject("政务跑批更新" + LocalDateTime.now());
            messageHelper.setText(errorMsg);
            makeMail().send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    //封装数据推送逻辑

    public static void printParamter(Object object)
    {
        System.out.println("记录数目:"+object.toString());
    }

    public static  void outFile(String content)
    {   //创建文件对象
        File file = new File("F:/", "pushLog.txt");
        try {
            if (!file.exists()) {				//如果文件不存在则新建文件
                file.createNewFile();

            }
            FileOutputStream output = new FileOutputStream(file);
            //换行
            content = content+"\r\n";
            //将数组的信息写入文件中
            output.write(content.getBytes("utf-8"));
            output.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
