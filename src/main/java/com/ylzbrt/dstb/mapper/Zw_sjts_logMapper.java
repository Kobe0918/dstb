package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.Zw_sjts_log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Zw_sjts_logMapper {
    int deleteByPrimaryKey(String logid);

    int insert(Zw_sjts_log record);

    int insertSelective(Zw_sjts_log record);

    Zw_sjts_log selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(Zw_sjts_log record);

    int updateByPrimaryKeyWithBLOBs(Zw_sjts_log record);

    int updateByPrimaryKey(Zw_sjts_log record);

    @Select(value = "select logid,catalog,soapinxml,results from zw_sjts_log where success = 0 and resubmit = 0")
    List<Zw_sjts_log> selectList();

    @Select(value = "select logid,catalog,soapinxml,results from zw_sjts_log where success = 0 and resubmit = 1")
    List<Zw_sjts_log> selectListRePass();

    @Update(
            value = "update zw_sjts_log  set results = #{msg},success = 1,resubmit = 1, resub_date = sysdate where logid = #{logId}"
    )
    void updateLogIfTrue(@Param("msg") String msg, @Param("logId") String logId);

    @Update(
            value = "update zw_sjts_log  set results = #{msg}, resub_date = sysdate,resubmit =${resubmit} where logid = #{logId}"
    )
    void updateLogIfFalse(@Param("msg") String msg, @Param("logId") String logId, @Param("resubmit") String resubmit);

    @Update(
            value = "update zw_sjts_log  set results = #{msg}, resub_date = sysdate where logid = #{logId}"
    )
    void updateLogFalse(@Param("msg") String msg, @Param("logId") String logId);

    @Select(value = "select count(logid) from  zw_sjts_log where to_number(to_char(in_date,'yyyymmdd')) <= ${upTime}")
    Long selectCountBeforeTime(@Param("upTime") Integer upTime);

    @Select(value = "select count(logid) from  zw_sjts_log where to_number(to_char(in_date,'yyyymmdd')) > ${upTime}")
    Long selectCountAfterTime(@Param("upTime") Integer upTime);

    List<Zw_sjts_log> selectZwSjtsLogDataByPageBeforeTime(@Param("begin") long begin, @Param("end") long end, @Param("upTime") Integer upTime);

    List<Zw_sjts_log> selectZwSjtsLogDataByPageAfterTime(@Param("begin") long begin, @Param("end") long end, @Param("upTime") Integer upTime);


    Integer selectCount(@Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("catalog") String catalog);

    List<Zw_sjts_log> selectByTime(@Param("begin") int begin, @Param("end") int end, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("catalog") String catalog);


}