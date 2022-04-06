package com.geekbang.supermarket;

import com.geekbang.supermarket.MerchandiseV2;

public class Phone extends MerchandiseV2 {
    private double screenSize;
    private double cpuHz;
    private int storageG;
    private int memoryG;
    private String brand;
    private String os;
    private double speed;
    private static int MAX_BUY_ONE_ORDER = 5;
//TODO 成员内部类，是在类中直接定义类
//TODO 成员内部类，不可以包含任何静态的成分，比如静态方法，静态变量，静态内部类，否则会造成内外类初始化问题
//TODO 成员内部类，可以有访问控制符，成员内部类和成员方法，成员变量一样，都是类的组成部分
    public class CPU {
        //TODO 可以有final static的基本数据类型变量
        final static int abc = 999;

        private String producer;

        public CPU(String producer) {
            this.producer = producer;
        }

        public double getSpeed() {
            //TODO 成员内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private的属性
            //TODO 成员内部类中有一个外部类的引用，其访问外部类的对象的成员属性就是使用这份引用，完整写法是：类名.this.属性/方法
            return Phone.this.speed;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }


        public String toString(){
            return "CPU"+
                    "speed="+getSpeed()+",producer = "+
                    producer+'\''+'}';
        }
        //TODO 成员内部类中可以有任何合法的类的组成部分，包括成员内部类，但是不能有静态成分
    }

    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHz, int memoryG, int storageG, String brand, String os
    ) {
        super(name, id, count, purchasePrice * 1.2, purchasePrice);
        this.storageG = storageG;
        this.screenSize = screenSize;
        this.cpuHz = cpuHz;
        this.memoryG = memoryG;
        this.brand = brand;
        this.os = os;
    }

    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }

//    public String getName() {
//        return this.brand + ":" + this.os + ":" + super.getName();
//    }

    public void describe2() {
        System.out.println("此手机的商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + ";系统为" + os + ";硬件配置如下:\n" +
                "屏幕" + screenSize + "寸\n" +
                "cpu主频" + cpuHz + "Ghz\n" +
                "内存" + memoryG + "Gb\n" +
                "储存空间" + storageG + "Gb\n");
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHz() {
        return cpuHz;
    }

    public void setCpuHz(double cpuHz) {
        this.cpuHz = cpuHz;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
