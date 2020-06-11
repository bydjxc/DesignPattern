package com.jack.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-25 15:34
 **/
public class Test {
    public static void main(String[] args) {
        Course course = Course.builder().buildCourseName("Java设计模式").buildcoursePPT("Java设计模式PPT").buildCourseVideo("Java设计模式视频").build();
        System.out.println(course);

        ImmutableSet<Object> set = ImmutableSet.builder().add("a").add("b").add("c").build();
        System.out.println(set);
    }
}
