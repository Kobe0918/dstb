package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.common.Name;

import java.util.Date;

public class ZwMc01 {
    @Name("统筹区编号")
    private String aaa027;
    @Name("身份证号码")
    private String aac002;
    @Name("姓名")
    private String aac003;
    @Name("单位档案号")
    private String aab001;
    @Name("单位名称")
    private String aab004;
    @Name("预产期")
    private Integer amc020;
    @Name("登记日期")
    private Date aae036;
    @Name("截止日期")
    private Integer aae031;
    @Name("登记人")
    private String aae011;

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027 == null ? null : aaa027.trim();
    }

    public String getAac002() {
        return aac002;
    }

    public void setAac002(String aac002) {
        this.aac002 = aac002 == null ? null : aac002.trim();
    }

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003 == null ? null : aac003.trim();
    }

    public String getAab001() {
        return aab001;
    }

    public void setAab001(String aab001) {
        this.aab001 = aab001 == null ? null : aab001.trim();
    }

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004 == null ? null : aab004.trim();
    }

    public Integer getAmc020() {
        return amc020;
    }

    public void setAmc020(Integer amc020) {
        this.amc020 = amc020;
    }

    public Date getAae036() {
        return aae036;
    }

    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }

    public Integer getAae031() {
        return aae031;
    }

    public void setAae031(Integer aae031) {
        this.aae031 = aae031;
    }

    public String getAae011() {
        return aae011;
    }

    public void setAae011(String aae011) {
        this.aae011 = aae011 == null ? null : aae011.trim();
    }
}