package com.jack.design.principle.openclose;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 10:34 2019/8/1
 * @Modified By
 * @Version 1.0
 */
public class JavaCourse implements Course {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
