package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.TempTrrymxYdZw;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TempTrrymxYdZwMapper {
    void doProcedure(Map<String, Object> paramMap);

    List<TempTrrymxYdZw> selectIncrementData(@Param("begin") int paramInt1, @Param("end") int paramInt2, @Param("aaa027") String paramString);
}