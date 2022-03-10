package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermarket.*;

import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        //创建一个小超市类
        LittleSuperMarket littleSuperMarkets = new LittleSuperMarket();
        littleSuperMarkets.superMarketName = "有家小超市";
        littleSuperMarkets.address = "浦东新区世纪大道666号";
        littleSuperMarkets.parkingCount = 200;
        littleSuperMarkets.merchandises = new Merchandise[200];
        littleSuperMarkets.merchandiseSold = new int[littleSuperMarkets.merchandises.length];

        Merchandise[] all = littleSuperMarkets.merchandises;//用all[]指向littleSuperMarket.merchandise;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();//for循环里创建的变量只在for循环代码块里起作用
            m.count = 200;
            m.Id = "Id" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.SoldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
        System.out.println("超市开张");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while (open) {
            System.out.println("本店叫做" + littleSuperMarkets.superMarketName);
            System.out.println("本店地址" + littleSuperMarkets.address);
            System.out.println("共有停车位" + littleSuperMarkets.parkingCount + "个");
            System.out.println("今日营业额" + littleSuperMarkets.incomingSum);
            System.out.println("共有商品" + littleSuperMarkets.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivigCar = Math.random() > 0.5;

            if (customer.isDrivigCar) {
                if (littleSuperMarkets.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来，本店已为您安排了车位，您的车位编号为" + littleSuperMarkets.parkingCount);
                    littleSuperMarkets.parkingCount--;
                } else {
                    System.out.println("停车位不足，欢迎下次光临");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临");
            }
            double totalCost = 0;
            while (true) {
                System.out.println("本店共有" + all.length + "种商品，欢迎选购。请输入商品编号");
                int index = scanner.nextInt();

                if (index < 0) {
                    break;
                }
                if (index >= all.length) {
                    System.out.println("本店没有这种商品，请输入编号在0到" + (all.length - 1) + "之间的数");
                    continue;
                }

                Merchandise m = all[index];
                System.out.println("您选购的商品为" + m.name + "。单价为" + m.SoldPrice + "请问您要购买多少个？");
                int numToBuy = scanner.nextInt();
                if (numToBuy <= 0){
                    System.out.println("不买看看也好，欢迎继续选购");
                    continue;
                }
                if (numToBuy*m.SoldPrice>customer.money){
                    System.out.println("您带的钱不够，欢迎继续挑选");
                    continue;
                }
                if (numToBuy>m.count){
                    System.out.println("本店库存不够，我们会尽快补货，欢迎继续选购");
                }

                    totalCost += numToBuy * m.SoldPrice;
                m.count -= numToBuy;
                littleSuperMarkets.merchandiseSold[index] = numToBuy;
            }

            customer.money -= totalCost;
            if (customer.isDrivigCar) {
                littleSuperMarkets.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费了" + totalCost);
            littleSuperMarkets.incomingSum = totalCost;

            System.out.println("还继续营业吗");
            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了！");
        System.out.println("总营业额为" + littleSuperMarkets.incomingSum + "。" + "营业情况如下");

        for (int i = 0; i < littleSuperMarkets.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarkets.merchandiseSold[i];

            if (numSold > 0) {
                double incomming = m.SoldPrice * numSold;
                double nrtIncomming = (m.SoldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个，销售额为" +
                        incomming + "净利润为" + nrtIncomming);
            }
        }

    }
}
