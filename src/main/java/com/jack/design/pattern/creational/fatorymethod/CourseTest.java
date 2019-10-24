package com.jack.design.pattern.creational.fatorymethod;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-10-23 15:21
 **/
public class CourseTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.study();
    }
}
