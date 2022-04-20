package com.geekbang.learnannotation;

public class TestUseAnnotation {
    public Object abc;

    //TODO 给annotation里的属性赋值的方式

    @PrimaryProperty(defaultValue = "testbggg",targetClass = TestUseAnnotation.class,abc = 9,
    defaultValues = {"aaa","bbb"})
    public void test(){

    }
}
