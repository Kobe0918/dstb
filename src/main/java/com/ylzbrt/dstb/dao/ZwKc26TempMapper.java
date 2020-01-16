package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKc26Temp;
import com.ylzbrt.dstb.entity.ZwKc26TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZwKc26TempMapper {
    int insert(ZwKc26Temp record);

    int insertSelective(ZwKc26Temp record);

    List<ZwKc26Temp> selectByExample(ZwKc26TempExample example);
}