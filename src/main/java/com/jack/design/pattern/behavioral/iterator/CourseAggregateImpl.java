package com.jack.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-06 10:17
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl(){
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
