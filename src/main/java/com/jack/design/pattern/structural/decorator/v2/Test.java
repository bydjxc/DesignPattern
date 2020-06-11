package com.jack.design.pattern.structural.decorator.v2;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-11-05 11:00
 **/
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake;

        abstractBatterCake = new BatterCake();

        //加一个鸡蛋
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        //加一个鸡蛋
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        //加一根香肠
        abstractBatterCake = new SausageDecorator(abstractBatterCake);
        //加一根香肠
        abstractBatterCake = new SausageDecorator(abstractBatterCake);

        System.out.println(abstractBatterCake.getDesc() + "销售价格：" + abstractBatterCake.cost());

    }
}
