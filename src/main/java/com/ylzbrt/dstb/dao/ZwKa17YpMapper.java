package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa17Yp;
import com.ylzbrt.dstb.entity.ZwKa17YpExample;
import java.util.List;

public interface ZwKa17YpMapper {
    int insert(ZwKa17Yp record);

    int insertSelective(ZwKa17Yp record);

    List<ZwKa17Yp> selectByExample(ZwKa17YpExample example);
}