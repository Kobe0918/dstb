package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKb01;
import com.ylzbrt.dstb.entity.ZwKb01Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ZwKb01Mapper {
    int insert(ZwKb01 record);

    int insertSelective(ZwKb01 record);

    List<ZwKb01> selectByExample(ZwKb01Example example);
}