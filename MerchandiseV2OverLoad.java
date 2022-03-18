package com.geekbang.supermarket;

public class MerchandiseV2OverLoad {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.purchasePrice = purchasePrice;
        this.id = id;
        this.soldPrice = soldPrice;
        this.count = count;
        this.name = name;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，商品id是" + id + "商品售价是" + purchasePrice
                + "进价是" + soldPrice + "库存" + count + "销售一个的毛利润为" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if (profit < 0) {
//            return 0;
//        }
        return profit;
    }

    public double buy() {
        return buy(1);
    }

    public double buy(int count) {
        return buy(count, false);
    }

    public double buy(int count, boolean isVip) {
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        if (isVip){
            return totalCost*0.95;
        }
        return totalCost;
    }
}
