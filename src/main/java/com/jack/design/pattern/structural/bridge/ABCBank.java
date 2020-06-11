package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-11 14:45
 **/
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
