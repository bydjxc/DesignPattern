package com.jack.design.pattern.structural.adapter.classadapter;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-06 11:07
 **/
public class ConcreteTarget implements Target{

    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
