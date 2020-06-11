package com.jack.design.pattern.structural.decorator.v2;

/**
 * @author kevin
 * @version v1.0
 * @description 抽象装饰器
 * @date 2019-11-05 10:43
 **/
public class AbstractDecorator extends AbstractBatterCake {

    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake){
        this.abstractBatterCake = abstractBatterCake;
    }
    @Override
    public String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return this.abstractBatterCake.cost();
    }
}
