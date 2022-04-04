package com.geekbang;

import com.geekbang.supermarket.AbstractExpireDateMerchandise;
import com.geekbang.supermarket.GamePointCard;

import java.util.Date;

public class UseAbsClass {
    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard =new GamePointCard(
                "点卡001","pointCard 001",100, 1999,999,
                produceDate,expireDate);
        //>>TODO 父类的引用可以用子类的引用赋值，抽象类也是一样
        AbstractExpireDateMerchandise am = gamePointCard;
        am.describe();
    }
}
