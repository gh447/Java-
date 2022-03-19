package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2WithConstructor;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2WithConstructor merchandise = new MerchandiseV2WithConstructor
                ("书桌","DESK9527",40,999,500);

        //>> TODO 如果我们自己添加类构造方法，Java就不会添加无参数的构造方法
        //>> TODO 这时候我们就不能new一个对象不传递参数了（看例子）

      //  MerchandiseV2WithConstructor merchandiseV2WithConstructor = new MerchandiseV2WithConstructor()
        //>>TODO 如果不写参数会报错
    }
}
