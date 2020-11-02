package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKa17;
import com.ylzbrt.dstb.entity.ZwKa17Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKa17Mapper {
    int insert(ZwKa17 record);

    int insertSelective(ZwKa17 record);

    List<ZwKa17> selectByExample(ZwKa17Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;

}