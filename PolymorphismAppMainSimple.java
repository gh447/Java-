package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;

public class PolymorphismAppMainSimple {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道一号",500,600,100);
        //>>TODO 虽然是用父类的引用指向不同类型的对象，调用getName方法时，实际执行的方法取决于对象的类型，而非引用的类型
        //>>TODO 也就是说，能调用哪些方法，是引用决定的，但是具体执行哪个类的方法是引用指向的对象决定的
        //  TODO 这就是覆盖的精髓，覆盖是多态的一种，是最重要的一种
        //>>TODO 以getName举例，父类里有这个方法，所以肯定能调用，但是Phone覆盖了这个方法
        //  TODO 之前我们使用子类引用指向子类对象，调用子类里覆盖父类的方法，比如getName，调用的是子类的getName，我们觉得很自然
        //  TODO 这里变换的是我们使用父类的引用指向子类的对象，调用被子类覆盖的方法，实际执行的还是子类的getName方法
        System.out.println(superMarket.getMerchandiseOf(0).getName());
        System.out.println();
        System.out.println(superMarket.getMerchandiseOf(10).getName());
        //  TODO 如果没有子类里没有覆盖这个方法，那么就去父类里找，父类没有就去父类的父类里找，反之只要能让一个引用指向这个对象，
        //  TODO 就说明这个对象肯定是这个类型或者其子类的一个实例，（否则赋值会发生ClassCastException），总归有父类兜底
        System.out.println();
        System.out.println(superMarket.getMerchandiseOf(100).getName());
    }

}
