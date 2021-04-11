package com.ylzbrt.dstb.entity;

import java.util.Date;

public class Timer {
    private Date execTime;

    private String tableName;


    private String msg;

    public Timer(Date execTime, String tableName, String msg) {
        this.execTime = execTime;
        this.tableName = tableName;
        this.msg = msg;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}