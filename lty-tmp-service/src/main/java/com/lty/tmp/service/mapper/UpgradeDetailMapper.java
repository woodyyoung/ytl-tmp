package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.UpgradeDetail;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeDetailMapper {
    long countByExample(UpgradeDetailExample example);

    int deleteByExample(UpgradeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpgradeDetail record);

    int insertSelective(UpgradeDetail record);

    List<UpgradeDetail> selectByExample(UpgradeDetailExample example);

    UpgradeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpgradeDetail record, @Param("example") UpgradeDetailExample example);

    int updateByExample(@Param("record") UpgradeDetail record, @Param("example") UpgradeDetailExample example);

    int updateByPrimaryKeySelective(UpgradeDetail record);

    int updateByPrimaryKey(UpgradeDetail record);
}