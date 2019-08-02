package com.jack.design.principle.openclose;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 10:37 2019/8/1
 * @Modified By
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        /*Course course = new JavaCourse(96, "Java设计模式精讲", 399d);
        System.out.println("课程编号:"+course.getId()+" 课程名称:"+course.getName()+" 课程价格:"+course.getPrice());*/

        Course icourse = new JavaDiscountCourse(96, "Java设计模式精讲", 399d);
        JavaDiscountCourse course = (JavaDiscountCourse) icourse;
        System.out.println("课程编号:"+course.getId()+" 课程名称:"+course.getName()+" 课程原价:"+course.getOriginalPrice()+" 课程折后价:"+course.getPrice());
    }
}
