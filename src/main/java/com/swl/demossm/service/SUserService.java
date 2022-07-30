package com.swl.demossm.service;

import com.swl.demossm.bean.SUser;

public interface SUserService {
    public void registerUser(SUser sUser);
    public SUser selectByPrimaryKey(String id);
}
