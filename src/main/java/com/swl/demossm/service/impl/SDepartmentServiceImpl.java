package com.swl.demossm.service.impl;

import com.swl.demossm.bean.SDepartment;
import com.swl.demossm.dao.SDepartmentMapper;
import com.swl.demossm.service.SDepartmentService;
import com.swl.demossm.test.TestMethos;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class SDepartmentServiceImpl implements SDepartmentService {

    @Resource
    SDepartmentMapper sDepartmentMapper;

    @Override
    public void insertDepartment(SDepartment sDepartment) {
        sDepartmentMapper.createDepartment(sDepartment);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void removeDepartment(String id) {
        sDepartmentMapper.removeDepartment(id);
        TestMethos testMethos = new TestMethos();
        testMethos.TestTransactional();
    }
}
