package com.jack.design.pattern.creational.simplefactory;

/**
 * @author kevin
 * @version v1.0
 * @description 课程创建工厂
 * @date 2019-10-23 15:24
 **/
public class CourseFactory {
    /*public static ICourse create(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }*/
    /*public static ICourse create(String name){
        if (!(name == null && "".equals(name))){
            try {
                ICourse course = (ICourse) Class.forName(name).newInstance();
                return course;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }*/
    public static ICourse create(Class<? extends ICourse> clazz){
        if (clazz != null){
            try {
                ICourse course = clazz.newInstance();
                return course;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
