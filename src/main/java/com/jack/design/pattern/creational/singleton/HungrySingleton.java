package com.jack.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author kevin
 * @version v1.0
 * @description 饿汉式单例
 * @date 2019-10-28 14:54
 **/
public class HungrySingleton implements Serializable, Cloneable {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
