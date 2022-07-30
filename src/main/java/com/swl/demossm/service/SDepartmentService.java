package com.swl.demossm.service;

import com.swl.demossm.bean.SDepartment;

public interface SDepartmentService {
    public void insertDepartment(SDepartment sDepartment);

    void removeDepartment(String id);
}
