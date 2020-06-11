package com.jack.design.pattern.structural.decorator.v2;

/**
 * @author kevin
 * @version v1.0
 * @description 煎饼
 * @date 2019-11-05 10:24
 **/
public class BatterCake extends AbstractBatterCake{
    @Override
    public String getDesc(){
        return "煎饼";
    }
    @Override
    public int cost(){
        return 8;
    }
}
