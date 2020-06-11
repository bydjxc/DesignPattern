package com.jack.design.pattern.structural.decorator.v2;

/**
 * @author kevin
 * @version v1.0
 * @description 鸡蛋装饰者
 * @date 2019-11-05 10:56
 **/
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
