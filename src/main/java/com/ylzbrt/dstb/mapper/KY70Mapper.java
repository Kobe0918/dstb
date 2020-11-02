package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.KY70;
import com.ylzbrt.dstb.entity.KY70Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface KY70Mapper {
    int insert(KY70 record);

    int insertSelective(KY70 record);

    List<KY70> selectByExample(KY70Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;

}