package com.geekbang.supermarket.interfaces;

/**
 * VIP卡，打折卡，赠品卡等
 */
public interface Card {
    /**
     * 执行完打折策略后确定各科应该付多少钱
     * 再根据顾客有无VIP卡，判断是否继续打折，看顾客是否有现金卡，抵扣现金
     * @param totalCost 商品原价总价
     * @param totalCostAfterDiscount 实行完超市优惠活动后的总价
     * @param customer 购买的顾客
     * @param shoppingCart 购物车
     * @return 优惠额，注意不是优惠后的价格
     */
    double processCardDiscount(double totalCost,double totalCostAfterDiscount,
                               Customer customer,ShoppingCart shoppingCart);
}
