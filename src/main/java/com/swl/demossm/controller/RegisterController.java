package com.swl.demossm.controller;

import com.swl.demossm.bean.SUser;
import com.swl.demossm.service.SUserService;
import com.swl.demossm.tools.ToJSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RegisterController {

    ToJSONUtils toJSONUtils = new ToJSONUtils();
    @Autowired
    public SUserService sUserService;

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(@RequestParam Map<String, Object> params) {
        SUser sUser = new SUser();
        sUser.setId(null);
        sUser.setAccount((String) params.get("account"));
        sUser.setNickname((String) params.get("nickname"));
        sUser.setPassword((String) params.get("password"));
//        sUser.setGender((Integer) params.get("gender"));

        System.out.println("请求参数： " + toJSONUtils.toJSONString(params));
        sUserService.registerUser(sUser);
        return "home";
    }
}
