package com.jack.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author kevin
 * @version v1.0
 * @description 单例测试
 * @date 2019-10-28 10:24
 **/
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        LazySingleton lazySingleton  = LazySingleton.getInstance();
        Thread thread1 = new Thread(new TestThread());
        Thread thread2 = new Thread(new TestThread());
        thread1.start();
        thread2.start();
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());


        // 序列化破坏单例
//        HungrySingleton instance = HungrySingleton.getInstance();
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton-file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton-file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        //反射破坏单例
//        HungrySingleton instance = HungrySingleton.getInstance();
//        Class clazz = HungrySingleton.class;
//        Constructor declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        HungrySingleton newInstance = (HungrySingleton) declaredConstructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class clazz = LazySingleton.class;
//        Constructor declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        LazySingleton newInstance = (LazySingleton) declaredConstructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        //枚举单例
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton-file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton-file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());
        //枚举反射
//        EnumInstance instance = EnumInstance.getInstance();
//        Class clazz = EnumInstance.class;
//        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
//        declaredConstructor.setAccessible(true);
//        EnumInstance newInstance = (EnumInstance) declaredConstructor.newInstance("YiFeng", 666);
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        //枚举类中添加方法
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();


    }
}
