package com.geekbang.learnboxandunbox;

public class WrapperClassForBooleanAppMain {
    public static void main(String[] args) {
        //TODO boolean对应的类是Boolean，布尔值因为只有两个值，所以布尔类直接提供了这两个值得静态变量
        System.out.println("-------------静态变量-------------");

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        System.out.println("-----------valueOf---------------");
        //TODO 只有不分大小写的true才是true，其余字符串全是false
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("false"));
        System.out.println(Boolean.valueOf("asdf"));
        System.out.println(Boolean.valueOf(" true "));

    }
}
