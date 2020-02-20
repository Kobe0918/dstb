package com.ylzbrt.dstb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ylzbrt.dstb.util.ClassAnnotation;
import com.ylzbrt.dstb.util.FieldsAnnotation;

import java.util.Date;

@ClassAnnotation(value = "zw_ac01")
public class ZwAc01 {

   @FieldsAnnotation(value = "姓名")
    private String aac003;
    @FieldsAnnotation(value = "身份证件类型")
    private String aac058;
    @FieldsAnnotation(value = "身份证号码")
    private String aac002;
    @FieldsAnnotation(value = "性别")
    private String aac004;
    @FieldsAnnotation(value = "民族")
    private String aac005;
    @FieldsAnnotation(value = "出生日期")
    private Integer aac006;
    @FieldsAnnotation(value = "联系电话")
    private String aae005;
    @FieldsAnnotation(value = "地址")
    private String aae006;
    @FieldsAnnotation(value = "邮政编码")
    private String aae007;
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;
    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;
    @FieldsAnnotation(value = "所属地级市行政区划代码")
    private String yae512;
    @FieldsAnnotation(value = "移动电话")
    private String acb501;
    @FieldsAnnotation(value = "备注")
    private String aae013;

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003 == null ? null : aac003.trim();
    }

    public String getAac058() {
        return aac058;
    }

    public void setAac058(String aac058) {
        this.aac058 = aac058 == null ? null : aac058.trim();
    }

    public String getAac002() {
        return aac002;
    }

    public void setAac002(String aac002) {
        this.aac002 = aac002 == null ? null : aac002.trim();
    }

    public String getAac004() {
        return aac004;
    }

    public void setAac004(String aac004) {
        this.aac004 = aac004 == null ? null : aac004.trim();
    }

    public String getAac005() {
        return aac005;
    }

    public void setAac005(String aac005) {
        this.aac005 = aac005 == null ? null : aac005.trim();
    }

    public Integer getAac006() {
        return aac006;
    }

    public void setAac006(Integer aac006) {
        this.aac006 = aac006;
    }

    public String getAae005() {
        return aae005;
    }

    public void setAae005(String aae005) {
        this.aae005 = aae005 == null ? null : aae005.trim();
    }

    public String getAae006() {
        return aae006;
    }

    public void setAae006(String aae006) {
        this.aae006 = aae006 == null ? null : aae006.trim();
    }

    public String getAae007() {
        return aae007;
    }

    public void setAae007(String aae007) {
        this.aae007 = aae007 == null ? null : aae007.trim();
    }

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027 == null ? null : aaa027.trim();
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }

    public String getYae512() {
        return yae512;
    }

    public void setYae512(String yae512) {
        this.yae512 = yae512 == null ? null : yae512.trim();
    }

    public String getAcb501() {
        return acb501;
    }

    public void setAcb501(String acb501) {
        this.acb501 = acb501 == null ? null : acb501.trim();
    }

    public String getAae013() {
        return aae013;
    }

    public void setAae013(String aae013) {
        this.aae013 = aae013 == null ? null : aae013.trim();
    }
}