package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.BlackListVersion;
import com.lty.tmp.service.bean.entity.autocreate.BlackListVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlackListVersionMapper {
    long countByExample(BlackListVersionExample example);

    int deleteByExample(BlackListVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlackListVersion record);

    int insertSelective(BlackListVersion record);

    List<BlackListVersion> selectByExample(BlackListVersionExample example);

    BlackListVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlackListVersion record, @Param("example") BlackListVersionExample example);

    int updateByExample(@Param("record") BlackListVersion record, @Param("example") BlackListVersionExample example);

    int updateByPrimaryKeySelective(BlackListVersion record);

    int updateByPrimaryKey(BlackListVersion record);
}