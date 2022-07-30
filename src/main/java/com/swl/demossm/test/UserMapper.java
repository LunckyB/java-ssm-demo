package com.swl.demossm.test;

import com.swl.demossm.bean.SUser;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}
