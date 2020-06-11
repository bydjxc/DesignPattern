package com.jack.design.pattern.creational.singleton;

/**
 * @author kevin
 * @version v1.0
 * @description 静态内部类的单例
 * @date 2019-10-28 14:41
 **/
public class StaticInnerSingleton {
    private static class InnerClass {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){
        if (InnerClass.staticInnerSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerSingleton getInstance(){
        return InnerClass.staticInnerSingleton;
    }
}
