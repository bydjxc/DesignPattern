package com.jack.design.pattern.structural.decorator.v2;

/**
 * @author kevin
 * @version v1.0
 * @description 煎饼装饰者
 * @date 2019-11-05 10:58
 **/
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
