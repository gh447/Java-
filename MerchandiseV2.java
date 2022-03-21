package com.geeekbang.supermareket;

public class MerchandiseV2 {
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;
    private NonPublicClassCanUseAnyName nonPublicClassCanUseAnyName;
    public static double DISCOUNT = 0.1;
    //>> TODO 构造方法如果是private的，那么就只有当前的类可以调用这个构造方法

    public MerchandiseV2(String name, String id, int count,
                         double soldPrice, double purchasePrice) {
        this.name = name;
        this.count = count;
        this.id = id;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    //>> TODO 有时候会把所有的构造方法都定义成private的，然后使用静态方法调用构造方法
    //>> TODO 同样的，这样做的好处是可以通过代码，检查每个属性是否合法。
    public static MerchandiseV2 createMerchandise(String name, String id, int count,
                                                  double soldPrice, double purchasePrice) {
        if (soldPrice < 0 || purchasePrice < 0) {
            return null;
        }
        return new MerchandiseV2(name, id, count, soldPrice, purchasePrice);
    }

    //构造方法的重载
    public MerchandiseV2(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1);
    }

    // public 的方法类似一种约定，既然外面的代码可以使用，就意味着不能乱改，比如不能改签名之类。
    public void describe() {
        System.out.println("商品名字叫做" + name + "商品is是" + id + ",商品售价是" + soldPrice + "," +
                "商品进价是" + purchasePrice + "，商品库存为" + count +
                "销售一个商品的毛利是" + (soldPrice - purchasePrice));
        freeStyle();
    }

    //TODO 对于private的方法，因为类外面调不到，所以无论怎么改也不会直接影响累外面的代码
    private void freeStyle() {

    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        return this.count -= count;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public static double getDISCOUNT() {
        return DISCOUNT;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setDISCOUNT(double DISCOUNT) {
        MerchandiseV2.DISCOUNT = DISCOUNT;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

}
