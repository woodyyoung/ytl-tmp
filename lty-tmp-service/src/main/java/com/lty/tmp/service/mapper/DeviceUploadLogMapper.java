package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.DeviceUploadLog;
import com.lty.tmp.service.bean.entity.autocreate.DeviceUploadLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceUploadLogMapper {
    long countByExample(DeviceUploadLogExample example);

    int deleteByExample(DeviceUploadLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceUploadLog record);

    int insertSelective(DeviceUploadLog record);

    List<DeviceUploadLog> selectByExample(DeviceUploadLogExample example);

    DeviceUploadLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceUploadLog record, @Param("example") DeviceUploadLogExample example);

    int updateByExample(@Param("record") DeviceUploadLog record, @Param("example") DeviceUploadLogExample example);

    int updateByPrimaryKeySelective(DeviceUploadLog record);

    int updateByPrimaryKey(DeviceUploadLog record);
}