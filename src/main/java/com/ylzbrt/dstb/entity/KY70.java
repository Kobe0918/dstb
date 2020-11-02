package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.Name;

import java.math.BigDecimal;

public class KY70 {
    @Name("人员编号")
    private BigDecimal aac001;
    @Name("统筹区编号")
    private String aaa027;
    @Name("姓名")
    private String aac003;
    @Name("身份证号码")
    private String aac002;
    @Name("消费时间")
    private Integer ake007;
    @Name("生育日期")
    private Integer amc020;
    @Name("生育津贴")
    private BigDecimal amc030;
    @Name("本次总费用")
    private BigDecimal akc227;
    @Name("基金支付")
    private BigDecimal bkc045;

    public BigDecimal getAac001() {
        return aac001;
    }

    public void setAac001(BigDecimal aac001) {
        this.aac001 = aac001;
    }

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

    public Integer getAke007() {
        return ake007;
    }

    public void setAke007(Integer ake007) {
        this.ake007 = ake007;
    }

    public Integer getAmc020() {
        return amc020;
    }

    public void setAmc020(Integer amc020) {
        this.amc020 = amc020;
    }

    public BigDecimal getAmc030() {
        return amc030;
    }

    public void setAmc030(BigDecimal amc030) {
        this.amc030 = amc030;
    }

    public BigDecimal getAkc227() {
        return akc227;
    }

    public void setAkc227(BigDecimal akc227) {
        this.akc227 = akc227;
    }

    public BigDecimal getBkc045() {
        return bkc045;
    }

    public void setBkc045(BigDecimal bkc045) {
        this.bkc045 = bkc045;
    }
}