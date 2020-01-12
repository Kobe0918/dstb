package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa03;
import com.ylzbrt.dstb.entity.ZwKa03Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKa03Mapper {
    int insert(ZwKa03 record);

    int insertSelective(ZwKa03 record);

    List<ZwKa03> selectByExample(ZwKa03Example example);
    /**
     * 调用存储过程
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;

}