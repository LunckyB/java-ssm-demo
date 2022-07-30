package com.swl.demossm.service.impl;

import com.swl.demossm.bean.SUser;
import com.swl.demossm.dao.SUserMapper;
import com.swl.demossm.service.SUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SUserServiceImpl implements SUserService {
    // 该注解类似与@Autowired
    @Resource
    public SUserMapper sUserMapper;

    @Override
    public void registerUser(SUser sUser) {
        sUserMapper.registerUser(sUser);
    }
}
