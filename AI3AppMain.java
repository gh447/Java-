package com.geekbang.learn.aiExample;

import java.util.Scanner;

public class AI3AppMain {
    public static void main(String[] args) {
        AI3 ai3 = new AI3();
        Scanner in = new Scanner(System.in);
        while(true){
            String input = in.next();
            if ("exit".equals(input)){
                System.out.println("再见");
                break;
            }
            String answer = ai3.answer(input);
            System.out.println(answer);

        }
    }
}
