package com.geekbang;
import com.geekbang.supermarket.*;

public class MerchandiseTest {
    //TODO 之前重载的时候用的是自定义类型，现在理解了父类和子类的引用赋值关系，重载又多了一层复杂性
    public void tesMerchandiseOverload(MerchandiseV2 me){
        System.out.println("参数为Merchandise的tesMerchandiseOverload 被调用了");
    }
    public void tesMerchandiseOverload(Phone ph){
        System.out.println("参数为Phone的tesMerchandiseOverload被调用了");
    }

    public void tesMerchandiseOverload(ShellColorChangePhone shellColorChangePhone){
        System.out.println("参数为she的tesMerchandiseOverload被调用了");
    }
    public void tesMerchandiseOverload(String str){
        System.out.println("参数为String的tesMerchandiseOverload被调用了");
    }
    public void testMerchandiseOverloadNotExactlyMatchType(MerchandiseV2 me){
        System.out.println("参数为MerchandiseV2的testMerchandiseOverloadNotExactlyMatchType被调用了");
    }
//    public void testMerchandiseOverloadNotExactlyMatchType(Phone ph){
//        System.out.println("参数为Phone的testMerchandiseOverloadNotExactlyMatchType被调用了");
//    }
    public void testMerchandiseOverloadNotExactlyMatchType(String str){
        System.out.println("参数为String的testMerchandiseOverloadNotExactlyMatchType被调用了");
    }
}
