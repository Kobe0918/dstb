package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.Name;

public class ZwMc03 {
    @Name("统筹区编号")
    private String aaa027;
    @Name("身份证号码")
    private String aac002;
    @Name("姓名")
    private String aac003;
    @Name("待遇发放号")
    private Long aaz196;
    @Name("待遇类型")
    private String bkc112;
    @Name("待遇类别")
    private String bkc001;
    @Name("建帐月份")
    private Integer aae206;

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

    public Long getAaz196() {
        return aaz196;
    }

    public void setAaz196(Long aaz196) {
        this.aaz196 = aaz196;
    }

    public String getBkc112() {
        return bkc112;
    }

    public void setBkc112(String bkc112) {
        this.bkc112 = bkc112 == null ? null : bkc112.trim();
    }

    public String getBkc001() {
        return bkc001;
    }

    public void setBkc001(String bkc001) {
        this.bkc001 = bkc001 == null ? null : bkc001.trim();
    }

    public Integer getAae206() {
        return aae206;
    }

    public void setAae206(Integer aae206) {
        this.aae206 = aae206;
    }
}