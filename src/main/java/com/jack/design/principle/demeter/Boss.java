package com.jack.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    /*public void commondCheckNumber(TeamLeader teamLeader){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }*/

    public void commondCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
