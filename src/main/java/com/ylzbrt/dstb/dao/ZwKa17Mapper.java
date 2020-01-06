package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa17;
import com.ylzbrt.dstb.entity.ZwKa17Example;
import java.util.List;

public interface ZwKa17Mapper {
    int insert(ZwKa17 record);

    int insertSelective(ZwKa17 record);

    List<ZwKa17> selectByExample(ZwKa17Example example);
}