package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.ylzbrt.dstb.common.ClassAnnotation;
import com.ylzbrt.dstb.common.FieldsAnnotation;

@ClassAnnotation(value="zw_ac43")
public class ZwAc43Temp {
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;

    @FieldsAnnotation(value = "身份证号")
    private String aac002;

    @FieldsAnnotation(value = "姓名")
    private String aac003;

    @FieldsAnnotation(value = "险种类型")
    private String aae140;

    @FieldsAnnotation(value = "个人缴费划入账户金额")
    private Short aae023;

    @FieldsAnnotation(value = "账目类型")
    private String aaa119;

    @FieldsAnnotation(value = "缴费基数")
    private BigDecimal aae340;

    @FieldsAnnotation(value = "建账年月")
    private Integer aae206;

    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @FieldsAnnotation(value = "账目年月")
    private Integer zmny00;

    @FieldsAnnotation(value = "个人缴费金额")
    private BigDecimal grjfje;

    @FieldsAnnotation(value = "单位缴费金额")
    private BigDecimal dwjfje;

    @FieldsAnnotation(value = "划拨日期")
    private Integer hbrq00;

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

    public String getAae140() {
        return aae140;
    }

    public void setAae140(String aae140) {
        this.aae140 = aae140 == null ? null : aae140.trim();
    }

    public Short getAae023() {
        return aae023;
    }

    public void setAae023(Short aae023) {
        this.aae023 = aae023;
    }

    public String getAaa119() {
        return aaa119;
    }

    public void setAaa119(String aaa119) {
        this.aaa119 = aaa119 == null ? null : aaa119.trim();
    }

    public BigDecimal getAae340() {
        return aae340;
    }

    public void setAae340(BigDecimal aae340) {
        this.aae340 = aae340;
    }

    public Integer getAae206() {
        return aae206;
    }

    public void setAae206(Integer aae206) {
        this.aae206 = aae206;
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }

    public Integer getZmny00() {
        return zmny00;
    }

    public void setZmny00(Integer zmny00) {
        this.zmny00 = zmny00;
    }

    public BigDecimal getGrjfje() {
        return grjfje;
    }

    public void setGrjfje(BigDecimal grjfje) {
        this.grjfje = grjfje;
    }

    public BigDecimal getDwjfje() {
        return dwjfje;
    }

    public void setDwjfje(BigDecimal dwjfje) {
        this.dwjfje = dwjfje;
    }

    public Integer getHbrq00() {
        return hbrq00;
    }

    public void setHbrq00(Integer hbrq00) {
        this.hbrq00 = hbrq00;
    }
}