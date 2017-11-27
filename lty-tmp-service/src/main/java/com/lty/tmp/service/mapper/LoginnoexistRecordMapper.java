package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.LoginnoexistRecord;
import com.lty.tmp.service.bean.entity.autocreate.LoginnoexistRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginnoexistRecordMapper {
    long countByExample(LoginnoexistRecordExample example);

    int deleteByExample(LoginnoexistRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginnoexistRecord record);

    int insertSelective(LoginnoexistRecord record);

    List<LoginnoexistRecord> selectByExample(LoginnoexistRecordExample example);

    LoginnoexistRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginnoexistRecord record, @Param("example") LoginnoexistRecordExample example);

    int updateByExample(@Param("record") LoginnoexistRecord record, @Param("example") LoginnoexistRecordExample example);

    int updateByPrimaryKeySelective(LoginnoexistRecord record);

    int updateByPrimaryKey(LoginnoexistRecord record);
}