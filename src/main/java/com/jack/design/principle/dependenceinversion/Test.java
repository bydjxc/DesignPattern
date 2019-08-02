package com.jack.design.principle.dependenceinversion;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 12:29 2019/8/2
 * @Modified By
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        Jack jack = new Jack();
        /*jack.studyJavaCourse();
        jack.studyPythonCourse();*/
        jack.studyCourse(new JavaCourse());
        jack.studyCourse(new PythonCourse());
    }
}
