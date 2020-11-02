package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.Name;

import java.math.BigDecimal;

public class MY56 {
    @Name("统筹区编号")
    private String aaa027;
    @Name("身份证号码")
    private String aac002;
    @Name("姓名")
    private String aac003;
    @Name("单位名称")
    private String aab004;
    @Name("年度")
    private Short aae001;
    @Name("首次参保日期")
    private Long ame501;
    @Name("个人月缴费基数")
    private BigDecimal ame502;
    @Name("生育津贴")
    private BigDecimal amc030;

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

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004 == null ? null : aab004.trim();
    }

    public Short getAae001() {
        return aae001;
    }

    public void setAae001(Short aae001) {
        this.aae001 = aae001;
    }

    public Long getAme501() {
        return ame501;
    }

    public void setAme501(Long ame501) {
        this.ame501 = ame501;
    }

    public BigDecimal getAme502() {
        return ame502;
    }

    public void setAme502(BigDecimal ame502) {
        this.ame502 = ame502;
    }

    public BigDecimal getAmc030() {
        return amc030;
    }

    public void setAmc030(BigDecimal amc030) {
        this.amc030 = amc030;
    }
}