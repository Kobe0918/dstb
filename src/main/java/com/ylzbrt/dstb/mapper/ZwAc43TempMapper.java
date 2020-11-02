package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwAc43Temp;
import com.ylzbrt.dstb.entity.ZwAc43TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwAc43TempMapper {
    int insert(ZwAc43Temp record);

    int insertSelective(ZwAc43Temp record);

    List<ZwAc43Temp> selectByExample(ZwAc43TempExample example);

    /**
     * 存储过程
     *
     * @param map
     */
    void ProZwAc43(Map<String, Object> map);

    /**
     * 城乡居民存储过程
     *
     * @param map
     */
    void ProZwAc43390(Map<String, Object> map);


    //begin   excel错误数据处理
    void insertErrorList(@Param("list") List<ZwAc43Temp> list);

    @Select(value = "select count(*) from zw_ac43_error")
    Long selectCount();

    List<ZwAc43Temp> selectZwAc43ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);
    //end


    // ---- 每天传输数据流程  begin
    //存储过程，增量数据
    void doProcedure(Map<String, Object> map);

    void doProcedure390(Map<String, Object> map);

    int selectCountToZw(@Param("aaa027") String aaa027, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    int selectCountToZw390(@Param("aaa027") String aaa027, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    List<ZwAc43Temp> selectZwAc43TempInsert(@Param("begin") int begin, @Param("end") int end); //, @Param("time")Date time,@Param("aaa027")String aaa027

    List<ZwAc43Temp> selectZwAc43TempDelete(@Param("begin") int begin, @Param("end") int end);

    List<ZwAc43Temp> selectZwAc43TempUpdate(@Param("begin") int begin, @Param("end") int end);

    List<ZwAc43Temp> selectZwAc43TempInsert390(@Param("begin") int begin, @Param("end") int end); //, @Param("time")Date time,@Param("aaa027")String aaa027

    List<ZwAc43Temp> selectZwAc43TempDelete390(@Param("begin") int begin, @Param("end") int end);

    List<ZwAc43Temp> selectZwAc43TempUpdate390(@Param("begin") int begin, @Param("end") int end);

    //测试批量插入数据
    void insertZwAc43(@Param("list") List<ZwAc43Temp> list);

    // ---- 每天传输数据流程  end
}