package com.geekbang.superMarket.mockthis;

public class MerchandiseV2MockThis {
    public String name;
    public String id;
    public double soldPrice;
    public double purchasePrice;
    public int count;

    public void describe(MerchandiseV2MockThis This) {
        System.out.println("商品名字是" + This.name + "商品id是" + This.id + "商品库存为" + This.count
                + "商品进价为" + This.purchasePrice + "商品售价为" + soldPrice
                + "销售一个的利润是" + (This.soldPrice - This.purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public void duplicatName(int count) {

    }

    public int getCount(MerchandiseV2MockThis This) {
        return This.count;
    }

    public void addCount(MerchandiseV2MockThis This, int count) {
        This.count += count;
    }

    public boolean hasEnoughFor(MerchandiseV2MockThis This, int count) {
        return This.count >= count;
    }

    public void makeEnoughFor(MerchandiseV2MockThis This, int count) {
        boolean hasEnough = This.hasEnoughFor(This, count);
        if (!hasEnough) {
            int toBeAdd = count - This.count;
            This.addCount(This, toBeAdd);
        }
    }
}
