package com.jack.design.pattern.behavioral.templatemethod;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-05 10:14
 **/
public class FECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端源代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
