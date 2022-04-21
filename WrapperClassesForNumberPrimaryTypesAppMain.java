package com.geekbang.learnboxandunbox;

import java.util.HashMap;
import java.util.Map;

public class WrapperClassesForNumberPrimaryTypesAppMain {
    public static void main(String[] args) {
        //TODO 从java第一个版本开始，java就为每种基本数据类型提供了封装的类，一遍可以将其当做类而非基本数据类型使用
        //TODO 就比如List Map 这些类，都是操作的Object，无法操作基本数据类型
        //TODO 和数字相关的基本数据类型对应的类依次为：Byte，Short，Integer，Long，Float，Double

        int a = 99;
        //TODO 可以使用数字创建一个Integer类，下面的方法在别的数字类中也类似
        Integer i1 = new Integer(a);
        Integer i2 = new Integer("798");
        int b = Integer.valueOf(a);
        int c = Integer.parseInt("998");

        System.out.println("------------自动封箱拆箱---------------");
        //TODO java提供了自动为每种基本数据类型和其封装类之间的转换功能
        //TODO 从基本数据类型到封装类，我们叫自动封箱（auto boxing），反之叫自动拆箱（auto unboxing）

        Integer ab = 987;
        int cd = ab;

        //TODO 自动封箱为Integer，作为Map中的key
        Map<Integer, String> int2str = new HashMap<>();
        int2str.put(1, "壹");
        int2str.put(2, "贰");
        int2str.put(3, "叁");
        System.out.println(int2str.get(1));

        //TODO 自动拆箱为int，并给key赋值
        for (int key : int2str.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------有用的方法------------");

        System.out.println(Integer.toBinaryString(-1024));//转成二进制的String
        System.out.println(Integer.toOctalString(-1024));//转成八进制的String
        System.out.println(Integer.toHexString(-1024));//转成十六进制的String

        System.out.println("----------------Number类--------------------");

        //TODO 所有和数字有关的封装类都继承自Number类
        Number num = 9;
        num = new Integer(13245);
        Number numD = 9.99;
        numD = new Double(12.30294);

        //TODO 使用Number类可以方便的进行数字类型的转换，当然所有的类都继承了Number的这些转换方法
        System.out.println("使用Number将double转换为long" + numD.longValue());

        System.out.println("-------------------自动拆箱可能的NPE---------------");

        int2str.put(null, "无");
        System.out.println(int2str.get(null));

        //TODO 自动拆箱为int，并给key赋值，但是有一个key为null，null是无法转成一个int的，注意null不是0
        //TODO 其实个自动拆箱，后面是Java帮我们调用了对应的方法，在这里就是intValue这个方法
        //TODO 所以当引用为null时自动拆箱，相当于是调用null的方法，所以这时候会发生NPE
        //TODO 对于其他封装类型的自动拆装箱，也是一样的

        for (int key: int2str.keySet()){
            System.out.println(key);
        }
    }
}
