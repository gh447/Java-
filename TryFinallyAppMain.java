package com.geekbang.exception;

public class TryFinallyAppMain {
    private static int VAL = 0;

    public static void main(String[] args) {
        System.out.println();
        System.out.println(VAL);
    }

    private static int withFinally() {
        int len = 0;
        try {
            String s = null;
//            String s1 = "abc";
            return s.length();
        }finally {
            System.out.println("执行finally语句");
            //>>TODO finally里最好不要有return语句，会打乱exception的传递
        }

    }
}
