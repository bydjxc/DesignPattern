package com.jack.design.pattern.structural.adapter;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-06 11:58
 **/
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5();
    }
}