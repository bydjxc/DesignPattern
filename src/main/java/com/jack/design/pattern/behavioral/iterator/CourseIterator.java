package com.jack.design.pattern.behavioral.iterator;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-06 10:14
 **/
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
