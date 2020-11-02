package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.dto.ZwKslwDTO;
import com.ylzbrt.dstb.entity.ZwKslwTemp;
import com.ylzbrt.dstb.entity.ZwKslwTempExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface ZwKslwTempMapper {
    int insert(ZwKslwTemp record);

    int insertSelective(ZwKslwTemp record);

    List<ZwKslwTemp> selectByExample(ZwKslwTempExample example);

    /**
     * 存储过程
     *
     * @param map
     */
    void ProZwKslw(Map<String, Object> map);

    /**
     * 获取推送数据
     *
     * @param aaa027
     * @return
     */
    List<ZwKslwTemp> selectZwKslwTemp(@Param("aaa027") String aaa027);


    List<ZwKslwTemp> selectZwKslwTempByAll();

    @Select("select count(0) from zw_kslw  where aaa027 = #{aaa027} AND akb021 is not  null")
    int selectCountAkb021IsNotNull(@Param("aaa027") String aaa027);

    //    5/26 for all
    @Select("select count(0) from zw_kslw_otheraaa027_lzh  where akb021 is not  null")
    int selectCountAkb021NotNull();

    List<ZwKslwTemp> selectZwKslwTempAkb021(@Param("aaa027") String aaa027);

    //    5/26 for all
    List<ZwKslwTemp> selectZwKslwTempAll();

    List<String> getAkb021FromQglwKb01(@Param("list") List<ZwKslwDTO> dto);

    @Delete("delete from zw_kslw where aaa027 = #{aaa027} AND akb021 is not  null ")
    void deleteDataAkb021IsNotNull(@Param("aaa027") String aaa027);

    //    5/26 for all
    @Delete("delete from zw_kslw_otheraaa027_lzh where  akb021 is not  null ")
    void deleteAkb021IsNotNull();

    void insertDataAkb021(@Param("list") List<ZwKslwTemp> list);


    List<ZwKslwTemp> selectZwKslwErrorData();


    //begin   excel错误数据处理

    /**
     * 批量插入错误数据
     *
     * @param kslwList
     */
    void insertErrorList(@Param("list") List<ZwKslwTemp> kslwList);


    List<ZwKslwTemp> selectZwKslwErrorDataByPage(@Param("begin") long begin, @Param("end") long end);

    @Select(value = "select count(*) from zw_kslw_error")
    Long selectCount();
    //end


    // ---- 每天传输数据流程  begin
    //存储过程增量数据生成
    void doProcedure(Map<String, Object> map);

    //新增数据
    List<ZwKslwTemp> selectZwKslwTempInsert(@Param("begin") int begin, @Param("end") int end, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("aaa027") String aaa027);

    //修改数据
    List<ZwKslwTemp> selectZwKslwTempUpdate(@Param("begin") int begin, @Param("end") int end, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("aaa027") String aaa027);

    //删除数据
    List<ZwKslwTemp> selectZwKslwTempDelete(@Param("begin") int begin, @Param("end") int end, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("aaa027") String aaa027);

    //测试批量插入数据
    void insertZwKslw(@Param("list") List<ZwKslwTemp> list);
    // ---- 每天传输数据流程  end
}