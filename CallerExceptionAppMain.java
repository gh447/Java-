package com.geekbang.exception;

public class CallerExceptionAppMain {
    public static void main(String[] args) throws ClassNotFoundException{
        makeCall();
    }
    private static void makeCall()throws  ClassNotFoundException{
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        caller1.call2Exception();
        System.out.println("调用结束");
    }
}
