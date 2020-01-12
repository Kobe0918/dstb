package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.common.Name;

public class ZwKa02 {
    @Name("商品名")
    private String aka061;
    @Name("通用名")
    private String ake002;
    @Name("药品剂型")
    private String aka070;
    @Name("药品规格")
    private String aka074;
    @Name("药品单位")
    private String aka067;
    @Name("是否医保项目")
    private String bka001;
    @Name("自付比例")
    private String bka010;
    @Name("所属区域")
    private String ssqy00;
    @Name("厂家名称")
    private String ypgymc;
    @Name("药品编码")
    private String aka060;

    public String getAka061() {
        return aka061;
    }

    public void setAka061(String aka061) {
        this.aka061 = aka061 == null ? null : aka061.trim();
    }

    public String getAke002() {
        return ake002;
    }

    public void setAke002(String ake002) {
        this.ake002 = ake002 == null ? null : ake002.trim();
    }

    public String getAka070() {
        return aka070;
    }

    public void setAka070(String aka070) {
        this.aka070 = aka070 == null ? null : aka070.trim();
    }

    public String getAka074() {
        return aka074;
    }

    public void setAka074(String aka074) {
        this.aka074 = aka074 == null ? null : aka074.trim();
    }

    public String getAka067() {
        return aka067;
    }

    public void setAka067(String aka067) {
        this.aka067 = aka067 == null ? null : aka067.trim();
    }

    public String getBka001() {
        return bka001;
    }

    public void setBka001(String bka001) {
        this.bka001 = bka001 == null ? null : bka001.trim();
    }

    public String getBka010() {
        return bka010;
    }

    public void setBka010(String bka010) {
        this.bka010 = bka010 == null ? null : bka010.trim();
    }

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }

    public String getYpgymc() {
        return ypgymc;
    }

    public void setYpgymc(String ypgymc) {
        this.ypgymc = ypgymc == null ? null : ypgymc.trim();
    }

    public String getAka060() {
        return aka060;
    }

    public void setAka060(String aka060) {
        this.aka060 = aka060 == null ? null : aka060.trim();
    }
}