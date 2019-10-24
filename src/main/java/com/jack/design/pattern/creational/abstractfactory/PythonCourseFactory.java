package com.jack.design.pattern.creational.abstractfactory;

/**
 * @author kevin
 * @version v1.0
 * @description Python课程工厂
 * @date 2019-10-24 11:04
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Artical getArtical() {
        return new PythonArtical();
    }
}
