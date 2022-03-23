package com.geekbang.supermarket;

public class PhoneMerchandise {
    //给phone增加新的属性和方法
    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storyG;
    private String brand;
    private String os;

    //我们要从商品类中复制所有的方法和属性，因为这是一个商品最基础的属性和操作

    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;

    public PhoneMerchandise(String name, String id, int count,
                            double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public PhoneMerchandise(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public PhoneMerchandise() {
        this("无名", "00001", 0, 1, 1.1);
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "id是" + id + ",商品售价是" + soldPrice +
                ",商品进价是" + purchasePrice + ",商品库存量为" + count
                + "，销售一个的毛利是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        }
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        return count * soldPrice;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
