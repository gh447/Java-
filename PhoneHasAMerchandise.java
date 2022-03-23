package com.geekbang.supermarket;

public class PhoneHasAMerchandise {

    //给Phone增加新的属性和方法

    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    //>>TODO 除了继承，我们也可以优化上节中使用的拷贝所有代码的方法，在Phone中添加商品的引用
    //  TODO 这样，我们也可以实现类似的功能
    //>>TODO 这种在自己的类里，使用别的类的两类之间的关系，我们叫做“has-a”，也称为组合
    //  TODO 具体到我们这个例子，在我们用类构造的世界中“Phone中有一个商品，但Phone本身不是商品”
    private MerchandiseV2 merchandise;

    public PhoneHasAMerchandise(double screenSize, double cpuHz, int memoryG, int storageG,
                                String brand, String os, MerchandiseV2 merchandise) {
        this.screenSize = screenSize;
        this.cpuHz = cpuHz;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
        this.merchandise = merchandise;
    }

    public void describePhone() {
        System.out.println("此手机商品属性如下");
        merchandise.describe();
        System.out.println("手机厂商为" + brand + ";系统为" + os + ";硬件配置如下：\n "
                + "屏幕" + screenSize + "寸\n" +
                "cpu主频" + cpuHz + "Ghz\n" +
                "内存" + memoryG + "Gb\n" +
                "储存空间为" + storageG + "Gb\n"
        );
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

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MerchandiseV2 getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(MerchandiseV2 merchandise) {
        this.merchandise = merchandise;
    }
}
