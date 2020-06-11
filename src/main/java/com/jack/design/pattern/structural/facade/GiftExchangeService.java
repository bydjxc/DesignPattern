package com.jack.design.pattern.structural.facade;

/**
 * @author kevin
 * @version v1.0
 * @description 积分兑换
 * @date 2019-11-01 12:28
 **/
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift gift){
        if (qualifyService.isAvailable(gift)){
            //资格校验通过
            if (pointsPaymentService.pay(gift)){
                //支付校验通过
                String shippingOrderNO = shippingService.shipGift(gift);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNO);
            }
        }
    }
}
