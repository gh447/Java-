package com.geekbang.supermarket.interfaces;

public interface Customer {
    String getCustId();

    /**
     * 开始购物前的准备
     */
    void startShopping();

    /**
     * 顾客想购买的商品种类
     *
     * @return
     */
    Category chooseCategory();

    /**
     * 顾客是否购买商品
     *
     * @param merchandise 判断是否要购买的商品
     * @return 购买多少个
     */
    int buyMerchandise(Merchandise merchandise);

    /**
     * 顾客是否买够了要结账
     *
     * @return true要结账，false继续逛
     */
    boolean wantToCheckout();

    /**
     * 付款
     *
     * @param shoppingCart 此次购买商品的购物车
     * @param totalCost    经过商品折扣策略折扣之后的总价
     * @return 成功之后返回支付的钱，否则返回-1
     */
    double payFor(ShoppingCart shoppingCart, double totalCost);

    /**
     *
     * @return 顾客花的钱
     */
    double getMoneySpent();
}
