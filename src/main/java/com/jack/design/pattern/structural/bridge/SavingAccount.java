package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description 活期
 * @date 2019-11-11 14:30
 **/
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
