package com.ylzbrt.dstb.service;

import com.ylzbrt.dstb.entity.ConfigEntity;
import org.springframework.scheduling.annotation.Async;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-01-13 11:54
 * @Description: ${Description}
 */
public interface IDstbService {


    void zwAc01();

    void zwKa08(ConfigEntity configEntity, String flag) throws Exception;

    void zwKc01(ConfigEntity configEntity, String flag) throws Exception;

    void zwKc99(ConfigEntity configEntity, String flag) throws Exception;

    void zwKslw(ConfigEntity configEntity, String flag) throws Exception;

    void zwAc43();

    void zwKc26(ConfigEntity configEntity, String flag) throws Exception;


    /**
     * 项目异常数据推送
     *
     * @param flag
     * @throws Exception
     */
    void zwSjtsLog(Integer upTime, boolean flag) throws Exception;


    /**
     * excel导入数据
     */
    @Async
    void insertByEcel();


    /**
     * excel导入的错误数据处理
     *
     * @param action "delete" 标识
     */
    //begin
    void zwAc01ErrorData(String action);

    void zwKa08ErrorData(String action);

    void zwKc99ErrorData(String action);

    void zwKslwErrorData(String action);

    void zwKc01ErrorData(String action);

    void zwKc26ErrorData(String action);

    void zwAc43ErrorData(String action);
    //end
}
