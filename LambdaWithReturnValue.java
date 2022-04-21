package com.geekbang.learnlambda;

import java.util.function.Function;

public class LambdaWithReturnValue {
    public static void main(String[] args) throws Exception {
        String ret = randomData(String::valueOf);
        System.out.println(ret);

        String retException = randomDataWithExceptionHandling(String::valueOf);
        System.out.println(retException);
    }

    public static String randomData(Function<Object, String> converter) {
        return converter.apply(Math.random());
    }

    public static String randomDataWithExceptionHandling(ExceptionLambda<Object,String>converter)throws Exception{
        return converter.hasException(Math.random());
    }
}

interface ExceptionLambda<P, R> {
    R hasException(P p) throws Exception;
}
