package com.geebang;

import java.util.Random;

public class LearnMath {
    public double freeStyle;

    public static void main(String[] args) {
        //TODO 我们调用的都是Math里的静态方法，Math的构造函数就是private的，意味着不能创建Math类的实例
        System.out.println(Math.random());
        //TODO 原来归根结底，Math的random是用random的类实现的，它在java.util的包里
        Random random = new Random();
        for(int i = 0;i<100;i++){
            //TODO next的返回值有正数有负数，所以在使用别人的类之前，一定要仔细看文档，避免出现问题
            System.out.println(Math.abs(random.nextInt()));
            //TODO abs是取绝对值
        }

        System.out.println(Math.abs(-9));

        System.out.println(Math.round(-9.2));
        System.out.println(Math.round(-9.5));//TODO 注意-9.5是-9
        System.out.println(Math.round(-9.8));
        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
        //TODO round四舍五入
    }
}
