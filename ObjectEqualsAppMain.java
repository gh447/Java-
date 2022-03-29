package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class ObjectEqualsAppMain {
    public static void main(String[] args) {

        int defaultCount = 200;
        LittleSuperMarket superMarket = new LittleSuperMarket(
                "大卖场","世纪大道001号",500,600,defaultCount);

        MerchandiseV2 t0 = new MerchandiseV2("商品"+0,"id"+0,defaultCount,1999,999);
        MerchandiseV2 t10 = new MerchandiseV2("商品"+10,"id"+10,defaultCount,1999,999);
        MerchandiseV2 t100 = new MerchandiseV2("商品"+100,"id"+100,defaultCount,1999,999);

        System.out.println(superMarket.findMerchandise(t0));
        System.out.println(superMarket.findMerchandise(t10));
        System.out.println(superMarket.findMerchandise(t100));
    }
}
