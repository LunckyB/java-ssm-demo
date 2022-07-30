package com.swl.demossm.test;

public class TestMethos {
    // 测试事务回滚
    public void TestTransactional() {
        System.out.println("开始执行TestTransactional方法");
        throw new Error("事务回滚");
    }
}
