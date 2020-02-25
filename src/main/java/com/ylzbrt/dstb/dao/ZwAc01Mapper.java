package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ConfigEntity;
import com.ylzbrt.dstb.entity.ZwAc01;
import com.ylzbrt.dstb.entity.ZwAc01Example;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwAc01Mapper {
    int insert(ZwAc01 record);

    int insertSelective(ZwAc01 record);

    List<ZwAc01> selectByExample(ZwAc01Example example);

    void ProZwAc01(Map<String,Object> map);

    List<ZwAc01> selectZwAC01(@Param("aaa027") String aaa027);


}