package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa02;
import com.ylzbrt.dstb.entity.ZwKa02Example;
import java.util.List;

public interface ZwKa02Mapper {
    int insert(ZwKa02 record);

    int insertSelective(ZwKa02 record);

    List<ZwKa02> selectByExample(ZwKa02Example example);
}