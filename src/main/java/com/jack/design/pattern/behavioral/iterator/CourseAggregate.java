package com.jack.design.pattern.behavioral.iterator;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-06 10:13
 **/
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
