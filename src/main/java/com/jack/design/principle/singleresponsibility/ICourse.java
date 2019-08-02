package com.jack.design.principle.singleresponsibility;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 9:31 2019/8/2
 * @Modified By
 * @Version 1.0
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
