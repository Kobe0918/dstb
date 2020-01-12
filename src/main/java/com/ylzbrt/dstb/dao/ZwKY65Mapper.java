package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKY65;
import com.ylzbrt.dstb.entity.ZwKY65Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKY65Mapper {
    int insert(ZwKY65 record);

    int insertSelective(ZwKY65 record);

    List<ZwKY65> selectByExample(ZwKY65Example example);

    /**
     * 调用存储过程
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;

}