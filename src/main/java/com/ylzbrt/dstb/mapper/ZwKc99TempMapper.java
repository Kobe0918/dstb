package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKc99Temp;
import com.ylzbrt.dstb.entity.ZwKc99TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface ZwKc99TempMapper {
    int insert(ZwKc99Temp record);

    int insertSelective(ZwKc99Temp record);

    List<ZwKc99Temp> selectByExample(ZwKc99TempExample example);

    /**
     * 存储过程
     *
     * @param map
     */
    void ProZwKc99(Map<String, Object> map);

    /**
     * 获取推送数据
     *
     * @param aaa027
     * @return
     */
    List<ZwKc99Temp> selectZwKc99Temp(@Param("aaa027") String aaa027);


    /**
     * 获取错误数据
     *
     * @return
     */
    List<ZwKc99Temp> selectZwKc99ErrorData();


    //begin   excel错误数据处理
    List<ZwKc99Temp> selectZwKc99ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);

    @Select(value = "select count(*) from zw_kc99_error")
    Long selectCount();

    /**
     * 错误数据导入
     *
     * @param list
     */
    void insertErrorList(@Param("list") List<ZwKc99Temp> list);
    //end


    // ---- 每天传输数据流程  begin
    void doProcedure(Map<String, Object> map);

    List<ZwKc99Temp> selectZwKc99TempInsert(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc99Temp> selectZwKc99TempUpdate(@Param("begin") int begin, @Param("end") int end);

    List<ZwKc99Temp> selectZwKc99TempDelete(@Param("begin") int begin, @Param("end") int end);

    int selectCountPassToZw(@Param("aaa027") String aaa027, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    //测试批量插入数据
    void insertZwKc99(@Param("list") List<ZwKc99Temp> list);
    // ---- 每天传输数据流程  end
}