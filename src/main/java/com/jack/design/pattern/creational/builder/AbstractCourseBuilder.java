package com.jack.design.pattern.creational.builder;

/**
 * @author kevin
 * @version v1.0
 * @description 课程建造者
 * @date 2019-10-25 14:48
 **/
public abstract class AbstractCourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void  buildCoursePPT(String coursePPT);

    public abstract void  buildCourseVideo(String courseVideo);

    public abstract void  buildCourseArticle(String courseArticle);

    public abstract void  buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
