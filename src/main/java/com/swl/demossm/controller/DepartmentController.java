package com.swl.demossm.controller;

import com.swl.demossm.bean.SDepartment;
import com.swl.demossm.service.SDepartmentService;
import com.swl.demossm.tools.ToJSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    ToJSONUtils toJSONUtils = new ToJSONUtils();

    @Autowired
    public SDepartmentService sDepartmentService;

    @PostMapping("/create")
    @ResponseBody
    public String registerUser(@RequestParam Map<String, Object> params) {
        SDepartment sDepartment = new SDepartment((String) params.get("id"), (String) params.get("name"), (String) params.get("parentid"), null, null, null, null, null, null, null);
        System.out.println("请求参数： " + toJSONUtils.toJSONString(sDepartment));
        sDepartmentService.insertDepartment(sDepartment);
        return "success";
    }
}
