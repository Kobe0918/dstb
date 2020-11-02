package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKa08Temp;
import com.ylzbrt.dstb.entity.ZwKa08TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKa08TempMapper {
    int insert(ZwKa08Temp record);

    int insertSelective(ZwKa08Temp record);

    List<ZwKa08Temp> selectByExample(ZwKa08TempExample example);

    /**
     * 存储过程
     *
     * @param map
     */
    void ProZwKa08(Map<String, Object> map);

    /**
     * 获取推送政务平台的数据
     *
     * @param aaa027
     * @return
     */
    List<ZwKa08Temp> selectZwKa08Temp(@Param("aaa027") String aaa027);

    void insertLists(List<ZwKa08Temp> temps);


    /**
     * 获取错误数据
     *
     * @return
     */
    List<ZwKa08Temp> selectZwKa08ErrorData();


    @Select(value = "select count(*) from zw_ka08 where aaa027 = ${aaa027} and aae035 > ${aae035}")
    Long selectNumber(@Param("aaa027") String aaa027, @Param("aae035") Date aae035);

    List<ZwKa08Temp> selectZwKa08RightDataByPage(@Param("begin") long begin, @Param("end") long end, @Param("aaa027") String aaa027, @Param("aae035") Date aae035);


    //begin   excel错误数据处理
    @Select(value = "select count(*) from zw_ka08_error")
    Long selectCount();

    /**
     * 错误数据批量插入
     *
     * @param list
     */
    void insertErrorList(@Param("list") List<ZwKa08Temp> list);

    List<ZwKa08Temp> selectZwKa08ErrorDataByPage(@Param("begin") long begin, @Param("end") long end);
    //end


    // ---- 每天传输数据流程  begin

    /**
     * 调用存储过程 增量数据
     *
     * @param map
     */
    void doProcedure(Map<String, Object> map);

    //新增数据
    List<ZwKa08Temp> selectZwKa08Insert(@Param("begin") int begin, @Param("end") int end);

    //修改数据
    List<ZwKa08Temp> selectZwKa08Update(@Param("begin") int begin, @Param("end") int end);

    //删除数据
    List<ZwKa08Temp> selectZwKa08Delete(@Param("begin") int begin, @Param("end") int end);

    //测试批量插入数据
    void insertZwKa08(@Param("list") List<ZwKa08Temp> list);

    // ---- 每天传输数据流程  end
}