package com.jack.design.pattern.creational.prototype.clone;

import com.jack.design.pattern.creational.singleton.HungrySingleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-31 9:20
 **/
public class CloneTest {
    public static void main(String[] args) throws Exception {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(6666666666666L);
//        pig1.setName("猪猪侠");
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig2.getBirthday().setTime(555555555555L);
//        System.out.println(pig1);
//        System.out.println(pig2);

//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);

        //使用对象流实现深克隆
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        //写进流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(pig1);

        //读取流
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
        Pig pig2 = (Pig) objectInputStream.readObject();
        pig2.getBirthday().setTime(77777777777L);
        System.out.println(pig1);
        System.out.println(pig2);


    }
}
