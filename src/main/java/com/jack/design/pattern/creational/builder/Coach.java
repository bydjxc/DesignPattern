package com.jack.design.pattern.creational.builder;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-25 15:04
 **/
public class Coach {

    private AbstractCourseBuilder builder;

    public void setBuilder(AbstractCourseBuilder builder) {
        this.builder = builder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA){
        builder.buildCourseName(courseName);
        builder.buildCoursePPT(coursePPT);
        builder.buildCourseVideo(courseVideo);
        builder.buildCourseArticle(courseArticle);
        builder.buildCourseQA(courseQA);

        return builder.makeCourse();
    }
}
