package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import com.ylzbrt.dstb.util.ClassAnnotation;
import com.ylzbrt.dstb.util.FieldsAnnotation;



@ClassAnnotation(value="zw_kslw")
public class ZwKslwTemp {
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;
    @FieldsAnnotation(value = "姓名")
    private String aac003;
    @FieldsAnnotation(value = "身份证号")
    private String aac002;
    @FieldsAnnotation(value = "就医地")
    private String bae033;
    @FieldsAnnotation(value = "开始日期")
    private Long aae030;
    @FieldsAnnotation(value = "终止日期")
    private Long aae031;
    @FieldsAnnotation(value = "参保地")
    private String aaa129;
    @FieldsAnnotation(value = "备案医疗机构名称")
    private String akb021;


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

    public String getBae033() {
        return bae033;
    }

    public void setBae033(String bae033) {
        this.bae033 = bae033 == null ? null : bae033.trim();
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

    public String getAaa129() {
        return aaa129;
    }

    public void setAaa129(String aaa129) {
        this.aaa129 = aaa129 == null ? null : aaa129.trim();
    }

    public String getAkb021() {
        return akb021;
    }

    public void setAkb021(String akb021) {
        this.akb021 = akb021 == null ? null : akb021.trim();
    }

}