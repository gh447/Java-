package com.geekbang.supermarket;

public class MerchandiseV2WithConstructor {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    //>>TODO 构造方法（constructor）的方法名跟类名必须一致，而且构造方法没有返回值。这样的方法才是构造方法。
    //>>TODO 构造方法可以有参数，规则和语法与普通方法一样，使用时，参数传递给new后类名的括号后面。
    //>>TODO 如果没有显示的添加一个构造方法，Java会默认给每个类都自带一个无参数的构造方法
    //  TODO 如果我们想自己添加类的构造方法Java就不会添加一个无参数的构造方法，这时候就不能new一个对象不传递参数了
    //>>TODO 所以我们一直在使用构造方法，这也是为什么创建对象时类名后面要加一个括号的原因
    //>>TODO 构造方法无法被点操作符调用或者在普通方法里面调用，只能通过创建对象时，间接调用
    //  TODO 理解一下人为什么构造方法不能有返回值，因为有返回值也没有意义，new语句永远返回的是创建出来的对象的引用

    public MerchandiseV2WithConstructor(String name, String id, int count, double soldPrice,
                                        double purchasePrice) {
        this.count = count;
        this.name = name;
        this.id = id;
        this.purchasePrice = purchasePrice;
        this.soldPrice = soldPrice;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + ",id是" + id + ",售价是" + soldPrice + ",进价是" + purchasePrice
                + "库存量是" + count + "销售一个的毛利是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit < 0) {
            return 0;
        }
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        return this.count -= count;
    }


}

