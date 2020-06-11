package com.jack.design.pattern.structural.flyweight;

import java.util.Random;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-07 15:17
 **/
public class Test {
    public static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            String department = departments[(int) (Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//        }

        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(200);
        Integer d = 200;

        System.out.println(a == b);//true
        System.out.println(c == d);//false
    }
}
