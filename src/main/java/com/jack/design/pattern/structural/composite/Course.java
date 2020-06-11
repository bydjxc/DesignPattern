package com.jack.design.pattern.structural.composite;

/**
 * @author kevin
 * @version v1.0
 * @description 课程
 * @date 2019-11-08 10:49
 **/
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course name:" + name + " price:" + price);
    }
}
