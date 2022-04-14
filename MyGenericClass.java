package com.geekbang.learngenerics.define;

//>>TODO 定义泛型就是把需要的类型定义在类后面的尖括号里，然后就可以在类里面就可以把定义好的泛型当成符号一样使用
public class MyGenericClass<First, Second> {
    //>>TODO 实际这两个类型都是Object的
    private First first;
    private Second second;

    public MyGenericClass(First first,Second second){
        this.first = first;
        this.second = second;
    }
    public First getFirst(){
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public <Another>Another getAnother(Object val){
        return (Another) val;
    }
}
