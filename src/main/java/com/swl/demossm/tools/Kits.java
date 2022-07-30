package com.swl.demossm.tools;

import java.util.UUID;

public class Kits {

    // 生成guid
    public final String getGuid() {
        UUID uuid = UUID.randomUUID();
        String s1 = uuid.toString();
        return s1.replace("-", "");
    }
}
