package com.ylzbrt.dstb.entity;

import java.util.Date;
import com.ylzbrt.dstb.common.ClassAnnotation;
import com.ylzbrt.dstb.common.FieldsAnnotation;

@ClassAnnotation(value="zw_ka08")
public class ZwKa08Temp {
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;
    @FieldsAnnotation(value = "身份证号")
    private String aac002;
    @FieldsAnnotation(value = "姓名")
    private String aac003;
    @FieldsAnnotation(value = "起始日期")
    private Long aae030;
    @FieldsAnnotation(value = "截止日期")
    private Long aae031;
    @FieldsAnnotation(value = "特殊病种名称")
    private String bke043;
    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

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

    public Long getAae030() {
        return aae030;
    }

    public void setAae030(Long aae030) {
        this.aae030 = aae030;
    }

    public Long getAae031() {
        return aae031;
    }

    public void setAae031(Long aae031) {
        this.aae031 = aae031;
    }

    public String getBke043() {
        return bke043;
    }

    public void setBke043(String bke043) {
        this.bke043 = bke043 == null ? null : bke043.trim();
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }
}