package com.geekbang.supermarket.impl;

import com.geekbang.supermarket.interfaces.Category;
import com.geekbang.supermarket.interfaces.Merchandise;

public class SuiYuanCustomer extends AbsCustomer {
    private static final double MUST_BUY_CHANCE = 0.8;
    private static final double GUANG_BUY_CHANCE = 0.1;

    public SuiYuanCustomer(String custId, Category mustBuy) {
        super(custId, mustBuy, DEFAULT_GUANG_COUNT);
    }

    public int buyMerchandise(Merchandise merchandise) {
        //买一个商品的概率
        double chanceToBuy = merchandise.getCategory() == getShouldBuy() ?
                MUST_BUY_CHANCE : GUANG_BUY_CHANCE;

        //无缘，返回0
        if (chanceToBuy < Math.random()){
            return 0;
        }else {
            //否则就买一个或多个;
            return 1+(int) (Math.random()*3);
        }
    }

}
