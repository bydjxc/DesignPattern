package com.jack.design.principle.dependenceinversion;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 12:37 2019/8/2
 * @Modified By
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Jack在学习Java课程");
    }
}
