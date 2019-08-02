package com.jack.design.principle.dependenceinversion;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 12:27 2019/8/2
 * @Modified By
 * @Version 1.0
 */
public class Jack {
    /*public void studyJavaCourse(){
        System.out.println("Jack在学习Java课程");
    }
    public void studyPythonCourse(){
        System.out.println("Jack在学习Python课程");
    }*/

    public void studyCourse(ICourse course){
        course.studyCourse();
    }
}
