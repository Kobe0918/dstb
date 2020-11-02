package com.ylzbrt.dstb.mapper;


import com.ylzbrt.dstb.entity.ZwDynamicConfigEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface ZwDynamicConfigMapper {

    @Select("SELECT tid,cron_expression,status,table_name FROM zw_dynamic_config where status = '1'")
    List<ZwDynamicConfigEntity> selectScheduledTask();

    @Select("SELECT last_pass_time FROM zw_dynamic_config where status = '1' and tid = #{tid}")
    Date selectLastUpdateTime(@Param("tid") String tid);

    @Update("Update zw_dynamic_config set next_pass_time = last_pass_time, last_pass_time = to_date(#{time},'yyyy-MM-dd hh24:mi:ss')  where status = '1' and tid = #{tid}")
    void updateLastUpdateTime(@Param("tid") String tid, @Param("time") String time);

    @Insert("insert into zw_java_log(table_name,msg,aaa027) values(#{name},#{msg},#{aaa027})")
    void insertIntoLog(@Param("msg") String msg, @Param("name") String name, @Param("aaa027") String aaa027);

    @Select("SELECT to_char(sysdate,'yyyy-MM-dd hh24:mi:ss') FROM dual")
    String getDbTime();
}
