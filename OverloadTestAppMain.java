package com.geekbang;

import com.geekbang.supermarket.*;

public class OverloadTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道001号", 500, 600, 100);
        MerchandiseV2 m = superMarket.getMerchandiseOf(100);

        MerchandiseTest merchandiseTest = new MerchandiseTest();
        System.out.println("------------1-----------");
        //TODO 参数调用哪个方法和参数的引用类型相关，和引用实际指向的类型无关，
        merchandiseTest.tesMerchandiseOverload(m);
        merchandiseTest.tesMerchandiseOverload((Phone) m);
        merchandiseTest.tesMerchandiseOverload((ShellColorChangePhone) m);
        //TODO 甚至是个null也可以，但是要用强制类型转换，告诉Java这个类型是什么，否则找不到一个唯一的方法去调用
        //TODO 重载的参数类型，相同位置，不一定要有继承或兼容的关系，完全free style
        merchandiseTest.tesMerchandiseOverload("");
        System.out.println("------------2------------");


        System.out.println();

        //TODO 引用本身是null没关系，确定要调用哪个方法只需要引用的类型，这叫静态多态，即在编译期就知道该调用哪个方法
        m = null;
        merchandiseTest.tesMerchandiseOverload(m);
        merchandiseTest.tesMerchandiseOverload((Phone)m);
        merchandiseTest.tesMerchandiseOverload((ShellColorChangePhone) m);
        System.out.println("------------3--------------");

        //TODO 如果引用类型没有完全匹配的，则会根据继承关系，沿着参数当前类型，向下撸
        merchandiseTest.testMerchandiseOverloadNotExactlyMatchType((ShellColorChangePhone)null);


        //TODO 重载总结：静态多态，调用的方法和实际指向的对象无关，只和引用本身的类型相关。
        //TODO 因为调用时，参数类型是确定的，所以在编译期间就明确地知道哪个方法会被调用。如果有多种可能，则会有编译错误
        //TODO 如果没有类型完全匹配的候选，则根据类型的继承关系向下撸着找，找到最贴近参数类型的那个方法
        //TODO 无论静态方法还是成员方法，重载寻找方法的顺序是一样的

    }
}
