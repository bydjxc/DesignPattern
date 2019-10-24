package com.jack.design.pattern.creational.abstractfactory;

/**
 * @author kevin
 * @version v1.0
 * @description Java课程工厂
 * @date 2019-10-24 11:04
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Artical getArtical() {
        return new JavaArtical();
    }
}
