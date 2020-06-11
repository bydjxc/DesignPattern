package com.jack.design.pattern.creational.singleton;

/**
 * @author kevin
 * @version v1.0
 * @description 基于ThreadLocal的伪单例
 * @date 2019-10-29 16:24
 **/
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }

}
