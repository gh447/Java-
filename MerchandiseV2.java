package com.geekbang.supermarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，商品id是" + id + ",商品库存为" + count + "，商品售价为" +
                soldPrice + ",商品进价为" + purchasePrice + "，商品利润为" + (soldPrice - purchasePrice));
    }

}
