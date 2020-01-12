package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.Timer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TimerMapper {
    int insert(Timer record);

    int insertSelective(Timer record);
}