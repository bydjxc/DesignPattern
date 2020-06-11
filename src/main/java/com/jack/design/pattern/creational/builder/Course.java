package com.jack.design.pattern.creational.builder;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-25 14:43
 **/
public class Course {
    /**
     * 课程名字
     * */
    private String courseName;

    /**
     * 课程PPT
     * */
    private String coursePPT;
    
    /**
     * 课程视频
     * */
    private String courseVideo;
    
    /**
     * 课程笔记
     * */
    private String courseArticle;
    
    /**
     * 课程问答
     * */
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
