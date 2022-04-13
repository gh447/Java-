package com.geekbang.exception;

public class TryCatchFinallyAppMain {
    private static int VAL = 0;

    public static void main(String[] args) {
        System.out.println(withFinally());
        System.out.println(VAL);
    }
    private static int withFinally(){
        int len = 0;
        try{
            String s = null;
//            String s1 = "abc";
            return s.length();
        }catch (Exception ex){
            len = -1;
            System.out.println("执行catch里的return语句");
            return len;
        }finally {
            System.out.println("执行finally语句" );
            VAL = 999;
            System.out.println("finally语句执行完毕");
        }
    }
}
