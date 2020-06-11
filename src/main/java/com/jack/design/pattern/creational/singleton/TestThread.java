package com.jack.design.pattern.creational.singleton;

/**
 * @author kevin
 * @version v1.0
 * @description 测试线程
 * @date 2019-10-28 10:28
 **/
public class TestThread implements Runnable{

    @Override
    public void run() {
//        LazySingleton singleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + singleton);

//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + instance);

//        ContainerSingleton.putInstance("object", new Object());
//        Object object = ContainerSingleton.getInstance("object");
//        System.out.println(Thread.currentThread().getName() + " " + object);

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);

    }
}
