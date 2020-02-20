package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.common.Name;

public class ZwKb01 {
    @Name("所属区域")
    private String ssqy00;
    @Name("网点编号")
    private String akb020;
    @Name("类别")
    private String akb022;
    @Name("网点名称")
    private String akb021;
    @Name("地址")
    private String aae006;
    @Name("所属分中心")
    private String fsfzx0;

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }

    public String getAkb020() {
        return akb020;
    }

    public void setAkb020(String akb020) {
        this.akb020 = akb020 == null ? null : akb020.trim();
    }

    public String getAkb022() {
        return akb022;
    }

    public void setAkb022(String akb022) {
        this.akb022 = akb022 == null ? null : akb022.trim();
    }

    public String getAkb021() {
        return akb021;
    }

    public void setAkb021(String akb021) {
        this.akb021 = akb021 == null ? null : akb021.trim();
    }

    public String getAae006() {
        return aae006;
    }

    public void setAae006(String aae006) {
        this.aae006 = aae006 == null ? null : aae006.trim();
    }

    public String getFsfzx0() {
        return fsfzx0;
    }

    public void setFsfzx0(String fsfzx0) {
        this.fsfzx0 = fsfzx0 == null ? null : fsfzx0.trim();
    }
}