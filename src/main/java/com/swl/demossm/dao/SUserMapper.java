package com.swl.demossm.dao;

import com.swl.demossm.bean.SUser;

public interface SUserMapper {
    public void registerUser(SUser sUser);
    public SUser selectByPrimaryKey(String id);
}
