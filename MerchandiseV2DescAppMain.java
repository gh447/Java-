package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2();

        merchandise.init("书桌","Desk0259",50,500,300);

        merchandise.describe();
    }

}
