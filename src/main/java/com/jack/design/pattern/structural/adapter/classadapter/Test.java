package com.jack.design.pattern.structural.adapter.classadapter;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-06 11:11
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
