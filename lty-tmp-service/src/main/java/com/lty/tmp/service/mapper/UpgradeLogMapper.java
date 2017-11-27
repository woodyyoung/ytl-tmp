package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.UpgradeLog;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeLogMapper {
    long countByExample(UpgradeLogExample example);

    int deleteByExample(UpgradeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpgradeLog record);

    int insertSelective(UpgradeLog record);

    List<UpgradeLog> selectByExample(UpgradeLogExample example);

    UpgradeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpgradeLog record, @Param("example") UpgradeLogExample example);

    int updateByExample(@Param("record") UpgradeLog record, @Param("example") UpgradeLogExample example);

    int updateByPrimaryKeySelective(UpgradeLog record);

    int updateByPrimaryKey(UpgradeLog record);
}