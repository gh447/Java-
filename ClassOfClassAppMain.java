package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.ShellColorChangePhone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassOfClassAppMain {
    public static void main(String... args) throws NoSuchFieldException,NoSuchMethodException{
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号",500,600,100);
        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
        //>>TODO Object类里的getClass方法，可以得到
        Class clazz = ShellColorChangePhone. class;

//        System.out.println(clazz.getName());
//        System.out.println(clazz.getSimpleName());

        //TODO 通过一个类的class实例，乐意获取一个类的所有信息，包括成员变量、方法等

//        Field countField = clazz.getField("count");
//        Field nameField = clazz.getField("count");
        //Field countField = clazz.getField("count");

        //TODO 变长参数和它的等价形式
//        Method equalsMethod = clazz.getMethod("equals", Object.class);
        Method buyMethod = clazz.getMethod("buy", int.class);
        Method equalsMethod  = clazz.getMethod("equals", Object.class);

    }


}
