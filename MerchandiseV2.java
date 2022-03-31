package com.geekbang.supermarket;


public class MerchandiseV2 {
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;
    private Category category;

    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice, Category category) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
        this.category = category;
    }
    public MerchandiseV2(){
        this("无名","001",0,1,1.1,Category.FOOD);
    }

    public void describe() {
        System.out.println("商品类别是" + category.name() + "。商品名字叫做" + name +
                ",商品id是" + id + ",商品售价是" + soldPrice + ",商品进价是" + purchasePrice +
                ",销售一个的毛利是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if (profit<=0){
//            return 0;
//        }
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            System.out.println("购买失败，库存不足");
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

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
