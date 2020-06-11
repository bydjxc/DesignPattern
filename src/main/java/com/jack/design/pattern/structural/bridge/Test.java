package com.jack.design.pattern.structural.bridge;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-11 14:55
 **/
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositeAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account savingAccount = abcBank.openAccount();
        savingAccount.showAccountType();
    }
}
