package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwMca1;
import com.ylzbrt.dstb.entity.ZwMca1Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwMca1Mapper {
    int insert(ZwMca1 record);

    int insertSelective(ZwMca1 record);

    List<ZwMca1> selectByExample(ZwMca1Example example);

    /**
     * 调用存储过程
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;
}