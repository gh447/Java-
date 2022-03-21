package com.geeekbang;

import com.geeekbang.supermareket.MerchandiseV2;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        //>> TODO 非公有的类，不能在包外被使用
        MerchandiseV2 merchandise = new MerchandiseV2("书桌","DESK9527",40,999);
        merchandise.describe();
    }
}
