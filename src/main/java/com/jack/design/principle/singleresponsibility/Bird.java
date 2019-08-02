package com.jack.design.principle.singleresponsibility;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 14:20 2019/8/1
 * @Modified By
 * @Version 1.0
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else {
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
