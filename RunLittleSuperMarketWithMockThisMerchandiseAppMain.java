package com.geekbang.superMarket.mockthis;

import com.geekbang.superMarket.MerchandiseV3;

public class RunLittleSuperMarketWithMockThisMerchandiseAppMain {
    public static void main(String[] args) {
        LittleSuperMarketWithMerchandiseMock littleSuperMarket = new LittleSuperMarketWithMerchandiseMock();
        littleSuperMarket.name = "有家小超市";
        littleSuperMarket.address = "明克街15号";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandise = new MerchandiseV2MockThis[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandise.length];

        MerchandiseV2MockThis all[] = littleSuperMarket.merchandise;
        for (int i = 0; i < all.length; i++) {
            MerchandiseV2MockThis m = new MerchandiseV2MockThis();
            m.count = 200;
            m.name = "商品" + i;
            m.id = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200 ;
            all[i] = m;
        }

        System.out.println("下面请利润最高的商品进行自我介绍");
        MerchandiseV2MockThis m = littleSuperMarket.getBiggestProfitMerchandise(littleSuperMarket);
        m.describe(m);
        System.out.println("调用makEnoughFor");
        m.makeEnoughFor(m,900);
        m.describe(m);
    }
}