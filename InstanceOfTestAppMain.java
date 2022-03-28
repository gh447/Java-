package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.Phone;

public class InstanceOfTestAppMain {
    public static void main(String[] args) {
        int merchandiseCount = 600;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道001号",500,merchandiseCount,100);
        //>>TODO instanceof操作符，可以判断一个引用指向的对象是否是某一个类型或其子类
        //  TODO 是则返回true，否则返回false
        for (int i = 0;i<merchandiseCount;i++){
            MerchandiseV2 m = superMarket.getMerchandiseOf(i);
            if (m instanceof Phone){
                Phone ph = (Phone) m;
                System.out.println(ph.getBrand());
            }
        }

        //TODO 如果引用是null，则肯定返回false
    }
}
