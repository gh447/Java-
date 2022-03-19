package com.geekbang.supermarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public double count;
    public double soldPrice;
    public double purchasePrice;


    public void init(String name, String id, double count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        System.out.println("商品名字是" + name + ",商品id是" + id + "商品库存为" + count + "商品售价为"
                + soldPrice + "商品进价为" + purchasePrice + "销售一个的毛利为" + (soldPrice - purchasePrice));
    }

    public double calculate() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        }
        return profit;
    }

    // >>TODO 方法调用时，参数不必完全类型一样，实参可以自动类型转换成形参就可以
    public double buyDouble(double count) {
        System.out.println("buyDouble(double)被调用了");
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = soldPrice * count;
        return totalCost;
    }

    // TODO 论斤卖的产品，数据类型是double。我们把count成员变量改成double类型。
    public double buy() {
        System.out.println("buy（）被调用了");
        return buy(1);
    }

    public double buy(int count) {
        System.out.println("buy(int)被调用了");
        return buy(count, false);
    }

    public double buy(int count, boolean isVip) {
        System.out.println("buy（int boolean被调用了）");
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        if (isVip) {
            return totalCost * 0.95;
        }
        return totalCost;
    }

}
