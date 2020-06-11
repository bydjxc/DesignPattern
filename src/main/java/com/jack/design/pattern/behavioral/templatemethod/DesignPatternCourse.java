package com.jack.design.pattern.behavioral.templatemethod;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-05 10:13
 **/
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArtical() {
        return true;
    }
}
