package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKc99Temp;
import com.ylzbrt.dstb.entity.ZwKc99TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ZwKc99TempMapper {
    int insert(ZwKc99Temp record);

    int insertSelective(ZwKc99Temp record);

    List<ZwKc99Temp> selectByExample(ZwKc99TempExample example);
}