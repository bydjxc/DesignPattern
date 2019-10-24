package com.jack.design.pattern.creational.fatorymethod;

/**
 * @author kevin
 * @version v1.0
 * @description Python工厂接口
 * @date 2019-10-23 16:07
 **/
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
