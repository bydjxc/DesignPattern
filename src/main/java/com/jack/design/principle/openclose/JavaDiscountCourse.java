package com.jack.design.principle.openclose;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 10:46 2019/8/1
 * @Modified By
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

//    public Double getOriginalPrice(){
//        return super.getPrice();
//    }
//
//    @Override
//    public Double getPrice() {
//        return super.getPrice()*0.8;
//    }
    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }
}
