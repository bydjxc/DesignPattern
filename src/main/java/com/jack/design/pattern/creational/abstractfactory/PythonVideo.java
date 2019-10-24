package com.jack.design.pattern.creational.abstractfactory;

/**
 * @author kevin
 * @version v1.0
 * @description Python视频
 * @date 2019-10-24 11:06
 **/
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("学习Python课程视频");
    }
}
