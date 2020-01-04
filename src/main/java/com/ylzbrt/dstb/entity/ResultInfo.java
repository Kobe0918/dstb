package com.ylzbrt.dstb.entity;

/**
 * @Author: guozy
 * @Description:
 * @Date:Created in  2020/1/1
 * @Modified By:
 */
public class ResultInfo {
    private String code ;
    private String msg  ;
    private String date ;

    public ResultInfo(String code, String msg, String date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }


    public ResultInfo() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
