package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKc01Temp;
import com.ylzbrt.dstb.entity.ZwKc01TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKc01TempMapper {
    int insert(ZwKc01Temp record);

    int insertSelective(ZwKc01Temp record);

    List<ZwKc01Temp> selectByExample(ZwKc01TempExample example);

    /**
     * 存储过程
     *
     * @param map
     */
    void ProZwK01(Map<String, Object> map);


    /**
     * 获取推送数据
     *
     * @param aaa027
     * @return
     */
    List<ZwKc01Temp> selectZwKc01Temp(@Param("aaa027") String aaa027);


    //begin   excel错误数据处理

    /**
     * 插入错误数据
     *
     * @param list
     */
    void insertErrorList(@Param("list") List<ZwKc01Temp> list);

    @Select("Select count(*) from zw_kc01_error")
    Long selectCount();

    List<ZwKc01Temp> selectZwKc01ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);
    //end


    // ---- 每天传输数据流程  begin

    //增量存储过程
    void doProcedure(Map<String, Object> map);

    /**
     * 存储过程(将当天要传输的数据传到表里)
     *
     * @param map
     */
    void ProZwK01Temp(Map<String, Object> map);

    List<ZwKc01Temp> selectZwKc01TempInsert(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc01Temp> selectZwKc01TempUpdate(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc01Temp> selectZwKc01TempDelete(@Param("begin") int begin, @Param("end") int end);

    int selectCountToZw(@Param("aaa027") String aaa027, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    //测试批量插入数据库
    void insertZwKc01(@Param("list") List<ZwKc01Temp> list);

    // ---- 每天传输数据流程  end


}