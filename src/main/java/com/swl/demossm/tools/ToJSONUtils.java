package com.swl.demossm.tools;

import com.alibaba.fastjson.JSON;

public class ToJSONUtils {

    public String toJSONString(Object object) {
        return JSON.toJSONString(object);
    }
}
