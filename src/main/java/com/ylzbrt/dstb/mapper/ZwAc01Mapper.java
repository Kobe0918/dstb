package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwAc01;
import com.ylzbrt.dstb.entity.ZwAc01Example;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwAc01Mapper {
    int insert(ZwAc01 record);

    int insertSelective(ZwAc01 record);

    List<ZwAc01> selectByExample(ZwAc01Example example);

    /**
     * 20200231 代码执行存储过程（一周一次）
     *
     * @param map
     */
    void ProZwAc01(Map<String, Object> map);

    /**
     * 获取推送政务平台的数据
     *
     * @param aaa027
     * @return
     */
    List<ZwAc01> selectZwAC01(@Param("aaa027") String aaa027);

    /**
     * 获取错误数据
     *
     * @return
     */
    List<ZwAc01> selectZwAC01ErrorData();


    @Select(value = "select count(*) from zw_ac01 where aaa027 = ${aaa027} and aae035 > ${aae035}")
    Long selectNumber(@Param("aaa027") String aaa027, @Param("aae035") Date aae035);

    List<ZwAc01> selectZwAC01RightDataByPage(@Param("begin") long begin, @Param("end") long end, @Param("aaa027") String aaa027, @Param("aae035") Date aae035);


    //begin   excel错误数据处理

    //错误数据批量插入
    void insertErrorList(@Param("list") List<ZwAc01> list);

    //查询总量
    @Select(value = "select count(*) from zw_ac01_error")
    Long selectCount();

    //分页读取
    List<ZwAc01> selectZwAC01ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);

    //end


    // ---- 每天传输数据流程  begin

    //存储过程，增量数据
    void doProcedure(Map<String, Object> map);

    List<ZwAc01> selectZwAc01TempInsert(@Param("begin") int begin, @Param("end") int end);

    List<ZwAc01> selectZwAc01TempUpdate(@Param("begin") int begin, @Param("end") int end);

    List<ZwAc01> selectZwAc01TempDelete(@Param("begin") int begin, @Param("end") int end);

    //测试批量插入数据
    void insertZwAc01(@Param("list") List<ZwAc01> list);

    // ---- 每天传输数据流程  end


}