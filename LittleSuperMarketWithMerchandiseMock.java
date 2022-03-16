package com.geekbang.superMarket.mockthis;

import com.geekbang.superMarket.MerchandiseV3;

public class LittleSuperMarketWithMerchandiseMock {
    public String name;
    public String address;
    public int parkingCount;
    public double incoming;
    public MerchandiseV2MockThis merchandise [];
    public int merchandiseSold [];

    public MerchandiseV2MockThis getBiggestProfitMerchandise(LittleSuperMarketWithMerchandiseMock This){
        System.out.println("LittleSuperMarket的getBiggestProfitMerchandise方法使用的对象是："+This);
        MerchandiseV2MockThis curr = null;
        for(int i = 0;i<This.merchandise.length;i++){
            MerchandiseV2MockThis m = This.merchandise[i];
            if (curr==null||curr.calculateProfit()<m.calculateProfit()){
                curr = m;
            }
        }
        return curr;
    }

}
