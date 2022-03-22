package com.geekbang.learn;

public class LearnSystem {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();

        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endMs = System.currentTimeMillis();
        System.out.println("程序执行使用了几毫秒？" + (endMs - startMs));

        long startNs = System.nanoTime();

        counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endNs = System.nanoTime();
        System.out.println("程序执行使用了几个纳秒？" + (endNs - startNs));

    }
}
