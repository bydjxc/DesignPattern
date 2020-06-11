package com.jack.design.pattern.structural.facade;

/**
 * @author kevin
 * @version v1.0
 * @description 物流对接
 * @date 2019-11-01 12:24
 **/
public class ShippingService {
    public String shipGift(PointsGift gift){
        //对接物流
        System.out.println(gift.getName() + "进入物流系统");
        String shippingOrderNO = "666666";
        return shippingOrderNO;
    }
}
