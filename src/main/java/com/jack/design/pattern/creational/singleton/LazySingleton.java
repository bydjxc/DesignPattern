package com.jack.design.pattern.creational.singleton;

/**
 * @author kevin
 * @version v1.0
 * @description 懒汉式单列
 * @date 2019-10-28 10:21
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
        if (lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
