package com.swl.demossm.service.impl;

import com.swl.demossm.bean.SDepartment;
import com.swl.demossm.dao.SDepartmentMapper;
import com.swl.demossm.service.SDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SDepartmentServiceImpl implements SDepartmentService {

    @Resource
    SDepartmentMapper sDepartmentMapper;

    @Override
    public void insertDepartment(SDepartment sDepartment) {
        sDepartmentMapper.createDepartment(sDepartment);
    }
}
