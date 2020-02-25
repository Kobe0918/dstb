package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.Date;

@com.ylzbrt.dstb.util.ClassAnnotation(value="zw_kc01")
public class ZwKc01Temp {
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "统筹区编号")
    private String aaa027;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "证件号码")
    private String aac002;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "姓名")
    private String aac003;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "社保卡号")
    private String aaz501;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "社保卡状态")
    private String aaz502;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "个人账户余额")
    private BigDecimal akc087;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "所属区域")
    private String ssqy00;

    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "所属县区")
    private String ssxq00;

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

    public String getAaz501() {
        return aaz501;
    }

    public void setAaz501(String aaz501) {
        this.aaz501 = aaz501 == null ? null : aaz501.trim();
    }

    public String getAaz502() {
        return aaz502;
    }

    public void setAaz502(String aaz502) {
        this.aaz502 = aaz502 == null ? null : aaz502.trim();
    }

    public BigDecimal getAkc087() {
        return akc087;
    }

    public void setAkc087(BigDecimal akc087) {
        this.akc087 = akc087;
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }

    public String getSsxq00() {
        return ssxq00;
    }

    public void setSsxq00(String ssxq00) {
        this.ssxq00 = ssxq00 == null ? null : ssxq00.trim();
    }
}