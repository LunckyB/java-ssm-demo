package com.swl.demossm.controller;

import com.alibaba.fastjson.JSON;
import com.swl.demossm.bean.SUser;
import com.swl.demossm.service.SUserService;
import com.swl.demossm.test.TestObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    public SUserService userService;

//    @RequestMapping("/getInfo")
//    public String getUserInfo(HttpServletRequest request){
//        SUser user = userService.getUserInfo("1001");
//        request.setAttribute("user",user);
//        return "userinfo";
//    }
//
//    @GetMapping("/test")
//    @ResponseBody
//    public String testReturunString() {
//        return "hello world!";
//    }
//
////    @GetMapping("/testObject")
//
//    @RequestMapping(value = "/testObject",produces = {"application/json;charset=GBK"})
//    @ResponseBody
//    public String testReturunObject(HttpServletRequest request) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("utf-8");
//
//        TestObject testObject = new TestObject("10001", 1024, "1M等于1024kb");
//        String s = JSON.toJSONString(testObject);
//        System.out.println(s + "转JSON： ");
//        return s;
//    }
}
