package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description 账户类型实体抽象
 * @date 2019-11-11 14:28
 **/
public interface Account {
    Account openAccount();
    void showAccountType();
}
