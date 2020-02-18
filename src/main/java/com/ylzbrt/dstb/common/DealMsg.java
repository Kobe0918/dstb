package com.ylzbrt.dstb.common;

/**
 * @Author: gzy
 * @Description:
 * @Date:Created in  2020/2/11
 * @Modified By:
 */

public class DealMsg {
    private Boolean flag;

    private String log;
    private String code;

    public DealMsg(Boolean flag, String log, String code) {
        this.flag = flag;
        this.log = log;
        this.code = code;
    }
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public DealMsg() {
    }

}
