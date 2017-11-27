package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.DeviceSoftware;
import com.lty.tmp.service.bean.entity.autocreate.DeviceSoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceSoftwareMapper {
    long countByExample(DeviceSoftwareExample example);

    int deleteByExample(DeviceSoftwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceSoftware record);

    int insertSelective(DeviceSoftware record);

    List<DeviceSoftware> selectByExample(DeviceSoftwareExample example);

    DeviceSoftware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceSoftware record, @Param("example") DeviceSoftwareExample example);

    int updateByExample(@Param("record") DeviceSoftware record, @Param("example") DeviceSoftwareExample example);

    int updateByPrimaryKeySelective(DeviceSoftware record);

    int updateByPrimaryKey(DeviceSoftware record);
}