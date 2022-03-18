package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.init("有家小超市","明克街15号",500,200,
                200);
        System.out.println("下面请利润最高的产品进行自我介绍");

        littleSuperMarket.getBiggestMerchandise().describe();
    }
}
