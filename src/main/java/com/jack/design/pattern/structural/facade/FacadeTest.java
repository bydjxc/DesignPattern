package com.jack.design.pattern.structural.facade;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-11-01 12:33
 **/
public class FacadeTest {
    public static void main(String[] args) {
        PointsGift gift = new PointsGift("机械键盘");
        GiftExchangeService exchangeService = new GiftExchangeService();
        exchangeService.giftExchange(gift);
    }
}
