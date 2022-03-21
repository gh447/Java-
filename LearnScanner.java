package com.geebang;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        //TODO Scanner 是一个很方便的帮我们从标准输入读取并数据转换的类
        //TODO 注释里的@since  1.5表示他是从Java1.5开始有的。
        Scanner scanner = new Scanner(System.in);
        //TODO 但这并不是说从Java5开始这个类就没有变过了
        //TODO 在原代码里搜索@since，会发现很多方法都是后面的版本加上去的
        //TODO 但是private就不会有这个文档显示，因为private本来就不给用

        System.out.println("请输入一个巨大的正数");
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println("请输入想给这个是加上多少");
        BigInteger toBeAdded = scanner.nextBigInteger();
        System.out.println("结果为"+bigInteger.add(toBeAdded));
    }

}
