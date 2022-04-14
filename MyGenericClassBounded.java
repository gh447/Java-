package com.geekbang.learngenerics.define;

import com.geekbang.learngenerics.ext.GrandParent;

public class MyGenericClassBounded <MyType extends GrandParent>{
    //TODO 实际上这个类型是Generation类型的
    private MyType myType;

    public MyGenericClassBounded(MyType myType){
        myType.getNum();
        this.myType = myType;
    }

    public void setMyType(MyType myType){
        this.myType = myType;
    }
}
