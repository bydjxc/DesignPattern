package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-11 14:34
 **/
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
