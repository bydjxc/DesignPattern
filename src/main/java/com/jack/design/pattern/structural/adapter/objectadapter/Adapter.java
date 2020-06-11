package com.jack.design.pattern.structural.adapter.objectadapter;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-06 11:17
 **/
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
