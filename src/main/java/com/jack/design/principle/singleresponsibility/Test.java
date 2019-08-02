package com.jack.design.principle.singleresponsibility;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 14:22 2019/8/1
 * @Modified By
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
