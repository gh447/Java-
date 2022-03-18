package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2OverLoad;

public class MerchandiseV2OverrideBuyAppMain {
    public static void main(String[] args) {
        MerchandiseV2OverLoad merchandise = new MerchandiseV2OverLoad();

        merchandise.init("书桌","DESK00985",40,999.9,500);
        merchandise.buy();
        merchandise.describe();

        double cost = merchandise.buy(10);
        System.out.println(cost);
        merchandise.describe();

        double vipCost = merchandise.buy(10,true);
        System.out.println(vipCost);
        merchandise.describe();
    }
}
