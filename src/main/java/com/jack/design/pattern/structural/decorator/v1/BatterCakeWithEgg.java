package com.jack.design.pattern.structural.decorator.v1;

/**
 * @author kevin
 * @version v1.0
 * @description 煎饼加蛋
 * @date 2019-11-05 10:24
 **/
public class BatterCakeWithEgg extends BatterCake{

    @Override
    public String getDesc(){
        return super.getDesc() + "加一个鸡蛋";
    }
    @Override
    public int cost(){
        return super.cost() + 1;
    }
}
