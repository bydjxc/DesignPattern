package com.jack.design.pattern.structural.facade;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-01 12:18
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift gift){
        System.out.println("校验" + gift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
