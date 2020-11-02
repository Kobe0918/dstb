package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.Name;

public class ZwMca1 {
    @Name("统筹区编号")
    private String aaa027;
    @Name("姓名")
    private String aac003;
    @Name("身份证号码")
    private String aac002;
    @Name("生育个人记录流水号")
    private String sylsh0;
    @Name("生育发生日期")
    private Integer amc020;
    @Name("生育证号")
    private String amc021;
    @Name("生育类别")
    private String amc026;
    @Name("晚育标志")
    private String amc027;
    @Name("胎儿数")
    private Short amc031;
    @Name("享受的产假")
    private Short amc032;

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027 == null ? null : aaa027.trim();
    }

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003 == null ? null : aac003.trim();
    }

    public String getAac002() {
        return aac002;
    }

    public void setAac002(String aac002) {
        this.aac002 = aac002 == null ? null : aac002.trim();
    }

    public String getSylsh0() {
        return sylsh0;
    }

    public void setSylsh0(String sylsh0) {
        this.sylsh0 = sylsh0 == null ? null : sylsh0.trim();
    }

    public Integer getAmc020() {
        return amc020;
    }

    public void setAmc020(Integer amc020) {
        this.amc020 = amc020;
    }

    public String getAmc021() {
        return amc021;
    }

    public void setAmc021(String amc021) {
        this.amc021 = amc021 == null ? null : amc021.trim();
    }

    public String getAmc026() {
        return amc026;
    }

    public void setAmc026(String amc026) {
        this.amc026 = amc026 == null ? null : amc026.trim();
    }

    public String getAmc027() {
        return amc027;
    }

    public void setAmc027(String amc027) {
        this.amc027 = amc027 == null ? null : amc027.trim();
    }

    public Short getAmc031() {
        return amc031;
    }

    public void setAmc031(Short amc031) {
        this.amc031 = amc031;
    }

    public Short getAmc032() {
        return amc032;
    }

    public void setAmc032(Short amc032) {
        this.amc032 = amc032;
    }
}