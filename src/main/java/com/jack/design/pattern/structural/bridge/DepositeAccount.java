package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description 定期
 * @date 2019-11-11 14:30
 **/
public class DepositeAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositeAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
