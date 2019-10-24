package com.jack.design.pattern.creational.simplefactory;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-10-23 15:21
 **/
public class CourseTest {
    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.study();
//        ICourse course = CourseFactory.create("java");
//        course.study();
//        ICourse course = CourseFactory.create("com.jack.design.pattern.simplefactorypattern.JavaCourse");
//        course.study();
        ICourse course = CourseFactory.create(JavaCourse.class);
        course.study();
    }
}
