package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.Date;

@com.ylzbrt.dstb.util.ClassAnnotation(value="zw_kc99")
public class ZwKc99Temp {
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "统筹区编号")
    private String aaa027;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "身份证号")
    private String aac002;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "姓名")
    private String aac003;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "地区")
    private String aaa129;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "险种类型")
    private String aae140;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "参保日期")
    private Integer aab050;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "单位名称")
    private String aab004;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "数据更新时间")
    private String aae035;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "工作状态")
    private String aac066;
    @com.ylzbrt.dstb.util.FieldsAnnotation(value = "年度缴费基数")
    private BigDecimal ndjfjs;

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

    public String getAaa129() {
        return aaa129;
    }

    public void setAaa129(String aaa129) {
        this.aaa129 = aaa129 == null ? null : aaa129.trim();
    }

    public String getAae140() {
        return aae140;
    }

    public void setAae140(String aae140) {
        this.aae140 = aae140 == null ? null : aae140.trim();
    }

    public Integer getAab050() {
        return aab050;
    }

    public void setAab050(Integer aab050) {
        this.aab050 = aab050;
    }

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004 == null ? null : aab004.trim();
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }

    public String getAac066() {
        return aac066;
    }

    public void setAac066(String aac066) {
        this.aac066 = aac066 == null ? null : aac066.trim();
    }

    public BigDecimal getNdjfjs() {
        return ndjfjs;
    }

    public void setNdjfjs(BigDecimal ndjfjs) {
        this.ndjfjs = ndjfjs;
    }
}