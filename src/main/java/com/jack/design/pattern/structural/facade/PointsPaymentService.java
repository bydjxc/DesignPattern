package com.jack.design.pattern.structural.facade;

/**
 * @author kevin
 * @version v1.0
 * @description 积分支付
 * @date 2019-11-01 12:20
 **/
public class PointsPaymentService {
    public boolean pay(PointsGift gift){
        //扣减积分
        System.out.println("支付" + gift.getName() + "积分成功");
        return true;
    }
}
