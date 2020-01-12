package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa02;
import com.ylzbrt.dstb.entity.ZwKa02Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@Mapper
@Repository
public interface ZwKa02Mapper {
    int insert(ZwKa02 record);

    int insertSelective(ZwKa02 record);

    List<ZwKa02> selectByExample(ZwKa02Example example);

    /**
     * 调用存储过程
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;

}