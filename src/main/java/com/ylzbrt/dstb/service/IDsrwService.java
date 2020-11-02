package com.ylzbrt.dstb.service;

public interface IDsrwService {

    void dealQslwFwwdb0(String option);

    void dealKb01(String option);

    void dealKa02(String option);

    void dealKa03(String option);

    void dealKa17Yp(String option);

    void dealKa17(String option);

    void dealKy65(String option);

    void dealMc01(String option);

    void dealMca1(String option);

    void dealMc03(String option);

    void dealMy56(String option);

    void dealKy70(String option);



    /**  定点医疗机构和药店
     *  数据传输
     * @param option
     */
    void passKb01(String option);

    /**  全省联网定点医疗机构和药店
     *  数据传输
     * @param option
     */
    void passQslwFwwdb0(String option);

    /**  药品目录
     *  数据传输
     * @param option
     */
    void passKa02(String option);

    /**  特殊药品目录
     *  数据传输
     * @param option
     */
    void passKa17Yp(String option);

    /**  诊疗目录
     *  数据传输
     * @param option
     */
    void passKa03(String option);

    /**  特殊病种诊疗目录
     *  数据传输
     * @param option
     */
    void passKa17(String option);

    /** 生育保险个人权益单-ky65
     * 数据传输
     * @param option
     */
     void dealZwky65Qz(String option,String AAA027);
    /** 生育产前登记-Mc01
     * 数据传输
     * @param option
     */
    void dealZwMc01Qz(String option,String AAA027);

    /** 生育保险刷卡记录-Ky70
     * 数据传输
     * @param option
     */
    void dealZwKy70Qz(String option,String AAA027);

    /**  生育登记信息-Mca1
     *  数据传输
     * @param option
     */
    void dealZwMca1Qz(String option,String AAA027);

    /** 生育待遇发放信息-Mc03
     *
     * 数据传输
     * @param option
     */
    void dealZwMc03Qz(String option,String AAA027);
    /** 生育保险个人权益单-My56
     *
     * 数据传输
     * @param option
     */
    void dealZwMy56Qz(String option,String AAA027);


}
