package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKa17Yp;
import com.ylzbrt.dstb.entity.ZwKa17YpExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKa17YpMapper {
    int insert(ZwKa17Yp record);

    int insertSelective(ZwKa17Yp record);

    List<ZwKa17Yp> selectByExample(ZwKa17YpExample example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;
}