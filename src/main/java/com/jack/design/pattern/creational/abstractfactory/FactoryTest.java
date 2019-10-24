package com.jack.design.pattern.creational.abstractfactory;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-10-24 11:20
 **/
public class FactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Artical artical = courseFactory.getArtical();
        video.produce();
        artical.produce();
    }
}
