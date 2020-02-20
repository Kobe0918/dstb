package com.ylzbrt.dstb.service;

public interface IDsrwService {
    /** 生育保险个人权益单-ky65
     * 全量数据传输
     * @param option
     */
     void dealZwky65Qz(String option,String AAA027);
    /** 生育产前登记-Mc01
     * 全量数据传输
     * @param option
     */
    void dealZwMc01Qz(String option,String AAA027);

    /** 生育保险刷卡记录-Ky70
     * 全量增量数据传输
     * @param option
     */
    void dealZwKy70Qz(String option,String AAA027);

    /**  生育登记信息-Mca1
     * 全量数据传输
     * @param option
     */
    void dealZwMca1Qz(String option,String AAA027);

    /** 生育待遇发放信息-Mc03
     *
     * 全量数据传输
     * @param option
     */
    void dealZwMc03Qz(String option,String AAA027);
    /** 生育保险个人权益单-My56
     *
     * 全量数据传输
     * @param option
     */
    void dealZwMy56Qz(String option,String AAA027);
}
