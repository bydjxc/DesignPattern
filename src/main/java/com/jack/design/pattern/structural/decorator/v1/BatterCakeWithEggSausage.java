package com.jack.design.pattern.structural.decorator.v1;

/**
 * @author kevin
 * @version v1.0
 * @description 煎饼加蛋加香肠
 * @date 2019-11-05 10:24
 **/
public class BatterCakeWithEggSausage extends BatterCakeWithEgg{

    @Override
    public String getDesc(){
        return super.getDesc() + "加一根香肠";
    }
    @Override
    public int cost(){
        return super.cost() + 2;
    }
}
