package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;

import java.util.Scanner;

public class StringEqualsAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket(
                "大卖场","实际大道1号",500,600,100);

        String s1 = "aaabbb";

        String s2 = "aaa"+"bbb";

        System.out.println("s1和时用==判断结果"+(s1==s2));
        System.out.println("s1和s2用equals判断"+(s1.equals(s2)));

        //>>TODO 打乱Java对String的优化，再试试看
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入s1");
        s1 = scanner.nextLine();

        System.out.println("请输入s2");
        s2 = scanner.nextLine();

        System.out.println("s1和时用==判断结果"+(s1==s2));

        System.out.println("s1和s2用equals判断"+(s1.equals(s2)));
    }
}
