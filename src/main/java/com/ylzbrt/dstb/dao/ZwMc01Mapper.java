package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwMc01;
import com.ylzbrt.dstb.entity.ZwMc01Example;
import java.util.List;

public interface ZwMc01Mapper {
    int insert(ZwMc01 record);

    int insertSelective(ZwMc01 record);

    List<ZwMc01> selectByExample(ZwMc01Example example);
}