package com.geekbang.supermarket;

import java.util.Date;

//>>TODO 接口的定义使用interface而非class
//>>TODO 接口中的方法就是这个类的规范，接口专注于规范，怎么实现这些规范他不管
//>>TODO 接口无法被实例化，也就是说不能new一个接口的实例
public interface ExpireDateMerchandise {
    //>>TODO 接口里的方法都是public abstract修饰的，方法有名字，参数和返回值，没有方法体，以分号;结束
    //>>TODO 接口注释最好写一下

    boolean notExpireInDays(int days);
    //>>TODO 因为接口里的方法都是public abstract修饰，所以这俩修饰符可以省略；
    //>>TODO abstract就是抽象方法的修饰符，没有方法体，以分号结束；
    Date getProducedDate();

    public abstract Date getExpireDate();

    double leftDatePercentage();

    double actualValueNow(double leftDatePercentage);
    //>>TODO 接口里不能定义局部变量，定义的变量默认都是public static final的，这三个修饰符同样可以省略
    public static final int VAL_IN_INTERFACE = 999;

}
