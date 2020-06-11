package com.jack.design.pattern.creational.builder;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-10-25 15:08
 **/
public class BuilderTest {
    public static void main(String[] args) {
        AbstractCourseBuilder builder = new CourseBuilder();
        Coach coach = new Coach();
        coach.setBuilder(builder);
        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT", "Java设计模式视频", "Java设计模式笔记", "Java设计模式问答");
        System.out.println(course);
    }
}
