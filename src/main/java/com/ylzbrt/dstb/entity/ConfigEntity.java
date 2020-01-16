package com.ylzbrt.dstb.entity;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.entity
 * @Author: lzh
 * @CreateTime: 2020-01-09 19:36
 * @Description: ${Description}
 */
public class ConfigEntity {
    private String updator;
    private String aaa027;
    private String host;        //发送邮件的主机
    private String mailSender;    //发件人
    private String pwd;      //qq邮箱为smtp
    private String mailReceiver;  //收件人
    private String title;           //邮件标题
    private String zw_account;   //政务webservice账号
    private String zw_pwd;        //政务webservice密码

    public String getZw_account() {
        return zw_account;
    }

    public void setZw_account(String zw_account) {
        this.zw_account = zw_account;
    }

    public String getZw_pwd() {
        return zw_pwd;
    }

    public void setZw_pwd(String zw_pwd) {
        this.zw_pwd = zw_pwd;
    }

    public String getUpdator() {
        return updator;
    }


    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMailSender() {
        return mailSender;
    }

    public void setMailSender(String mailSender) {
        this.mailSender = mailSender;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMailReceiver() {
        return mailReceiver;
    }

    public void setMailReceiver(String mailReceiver) {
        this.mailReceiver = mailReceiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
