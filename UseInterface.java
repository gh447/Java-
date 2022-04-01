package com.geekbang;

import com.geekbang.supermarket.*;

import java.util.Date;

public class UseInterface {
    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );
//        phoneExtendsMerchandise.describe

        //>>TODO 可以用接口实现的类的引用，给接口的引用赋值，类似于可以使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;

        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;
        virtual = (VirtualMerchandise) m;

        if (m instanceof  ExpireDateMerchandise){
            System.out.println("m是ExpireDateMerchandise类型的实例");
        }

        if(m instanceof  VirtualMerchandise){
            System.out.println("m是VirtualMerchandise类型的实例");
        }
    }
}
