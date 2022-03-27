package com.geekbang;
import com.geekbang.supermarket.*;

public class OverloadAndOverrideTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号",500,600,100);
        MerchandiseV2 m = superMarket.getMerchandiseOf(100);
        //TODO 让重载的归重载，剩下的是覆盖的舞台
        //TODO 重载决定了要调用参数为int的方法，这个方法要在m指向的对象上执行
        //TODO 很巧，这个对象很复杂，是个ShellColorChangePhone的对象
        //TODO 分别用true，1,3,6,做参数，运行结果是什么，为什么？
        m.buy(6);

    }

}
