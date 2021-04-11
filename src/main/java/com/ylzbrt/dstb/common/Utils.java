package com.ylzbrt.dstb.common;

import com.ylzbrt.dstb.annotion.Name;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @Author:
 * @Description:
 * @Date:Created in  2020/1/9
 * @Modified By:
 */

@Component
public class Utils {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${dstb.mail.host}")
    private String HOST;
    @Value("${dstb.mail.username}")
    private String USERNAME;
    @Value("${dstb.mail.password}")
    private String PASSWORD;
    @Value("${dstb.mail.default-encoding}")
    private String ENCODING;
    @Value("${dstb.mail.receiver}")
    private String RECEIVER;
    @Value("${dstb.mail.title}")
    private String TITLE;
    @Value("${zw.login.login-method}")
    private String METHOD;
    @Value("${zw.login.username}")
    private String ZWUSERNAME;
    @Value("${zw.login.password}")
    private String ZWPASSWORD;

    public static String getFourHoursBefore() {
        String returnstr = "";
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 4);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        returnstr = df.format(calendar.getTime());
        return returnstr;

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
    public String getPushMsg(String msg) {

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


    public String getXml(Object object, String option) {
        String s = "<row type=\"" + option + "\">";
        //获取类的变量声明信息
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                s += "<" + f.getName() + " name=\"" + f.getAnnotation(Name.class).value()
                        + "\" isattachment=\"false\"><![CDATA[" + ((f.get(object) == null) ? "" : f.get(object)) + "]]></" + f.getName() + ">";
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        s += "</row>";
        return s;
    }

    //封装数据推送逻辑
    public void printParamter(Object object) {
        System.out.println("记录数目:" + object.toString());
    }

    public void outFile(String content) {   //创建文件对象
        File file = new File("F:/", "pushLog.txt");
        try {
            if (!file.exists()) {                //如果文件不存在则新建文件
                file.createNewFile();

            }
            FileOutputStream output = new FileOutputStream(file);
            //换行
            content = content + "\r\n";
            //将数组的信息写入文件中
            output.write(content.getBytes("utf-8"));
            output.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    //实现JavaMailSender，自定义邮件发送器
    public JavaMailSenderImpl makeMail() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(HOST);
        mailSender.setUsername(USERNAME);
        mailSender.setPassword(PASSWORD);
        mailSender.setDefaultEncoding(ENCODING);
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
            messageHelper.setFrom(USERNAME, TITLE);
            messageHelper.setTo(RECEIVER);
            messageHelper.setSubject("政务跑批更新" + LocalDateTime.now());
            messageHelper.setText(errorMsg);
            makeMail().send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * 登入政务平台获取 guid进行数据传输
     */
    public String getGuid() throws Exception {
        String guid = null;
        while (true) {
            Client webService = WbClient.getWebService();
            Object[] invoke = webService.invoke(METHOD, ZWUSERNAME, ZWPASSWORD);
            guid = invoke[0].toString();
            if (!guid.contains("ERR") && !guid.contains("false")) {
                logger.info(guid);
                break;
            } else {
                throw new Exception("政务平台LoginByAccount接口账号密码登入返回：" + guid);
            }
        }
        return guid;
    }

    /**
     * 访问政务账号接口返回信息  判断状态
     *
     * @param guid
     * @return
     */
    public Boolean loginSuccess(String guid) {
        guid = guid.toLowerCase();
        return (!guid.contains("err") && !guid.contains("false"));
    }

    //分割数据集合 每500条一组
    private final static int SIZE = 500;

    public static <T> List<List<T>> splitList(List<T> list) {
        if (list == null || list.size() < 1) {
            return null;
        }

        List<List<T>> splitList = new ArrayList<>();
        //切割list每个list为1000（1000一次型插入速度最快）
        for (int i = 0; i < list.size(); i += SIZE) {
            int j = Math.min((i + SIZE), list.size());
            List<T> subList = list.subList(i, j);
            splitList.add(subList);
        }
        return splitList;
    }


    public static String getTimeByFormart(String formart) {
        SimpleDateFormat sim = new SimpleDateFormat(formart);
        return sim.format(new Date());
    }

    public static String getTimeByFormart(Date date, String formart) {
        SimpleDateFormat sim = new SimpleDateFormat(formart);
        return sim.format(date);
    }

    //获取前一天的额7点，供zw_sj错误处理类调用
    public static String getBeforeDaySevenClock() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);
        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore + " 07:00:00";
    }
     /*
     //拼接xml格式文件

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



 发送邮件
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

*/

    public static String[] getKc26DateArray() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = format.parse("2020-12-06");
        Date date2 = format.parse("2020-11-01");
        int a = (int) ((date1.getTime() - date2.getTime()) / (1000 * 3600 * 24));
        System.out.println(a);
        String[] times = new String[a];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(simpleDateFormat.parse("2020-10-31 18:00:00"));
        for (int i = 0; i < a; i++) {
            c.add(Calendar.DATE, +1);
            Date time = c.getTime();
            times[i] = simpleDateFormat.format(time);
            System.out.println(simpleDateFormat.format(time));
        }

        return times;
    }

    public static void main(String[] args) {
        try {
            String[] times = getKc26DateArray();
            int count = times.length;
            for (int i = 0; i < count; i++) {
                if (count == i + 1) {
                    break;
                } else {
                    System.out.println(times[i]);
                    System.out.println(times[i + 1]);
                    System.out.println("-------------------------------");
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
