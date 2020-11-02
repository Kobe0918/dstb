package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKc26Temp;
import com.ylzbrt.dstb.entity.ZwKc26TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKc26TempMapper {
    int insert(ZwKc26Temp record);

    int insertSelective(ZwKc26Temp record);

    List<ZwKc26Temp> selectByExample(ZwKc26TempExample example);

    void ProZwKc26(Map<String, Object> map);

    List<ZwKc26Temp> selectZwKc26Temp(@Param("aaa027") String aaa027);

    void insertZwKc26(@Param("list") List<ZwKc26Temp> list);


    //begin   excel错误数据处理
    void insertErrorList(@Param("list") List<ZwKc26Temp> list);

    @Select(value = "select count(id) from zw_kc26_error")
    Long selectCount();

    List<ZwKc26Temp> selectZwKc26ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);
    //end

    // ---- 每天传输数据流程  begin
    void doProcedure(Map<String, Object> map);

    List<ZwKc26Temp> selectZwKc26TempInsert(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc26Temp> selectZwKc26TempUpdate(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc26Temp> selectZwKc26TempDelete(@Param("begin") int begin, @Param("end") int end);
    // ---- 每天传输数据流程  end
}