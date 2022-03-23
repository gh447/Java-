package com.geekbang.supermarket;

//>>TODO 继承的语法就是在类名后面使用extends加 要继承的类名
//>>TODO 被继承的类叫做父类(Parent Class)，如本例中的MerchandiseV2
//>>TODO 继承者叫子类（Sub Class），如本例中的PhoneExtendsMerchandise
//>>TODO java中只允许一个类有一个直接的父类(Parent Class),即所谓的单继承
//>>TODO 没错，别的类也可以继承子类，比如可以有一个HuaweiPhone继承PhoneExtendsMerchandise
//  TODO 这时候，HuaweiPhone就是PhoneExtendsMerchandise的子类了
//>>TODO 子类继承了父类的什么呢？所有的属性和方法
//>>TODO 但是子类不能访问父类的private的成员变量和方法

public class PhoneExtendsMerchandise extends MerchandiseV2 {

    //给Phone增加新的属性和方法
    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storyG;
    private String brand;
    private String os;

    public PhoneExtendsMerchandise(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHz, int memoryG, int storyG, String brand, String os
    ) {
        this.brand = brand;
        this.cpuHz = cpuHz;
        this.os = os;
        this.memoryG = memoryG;
        this.storyG = storyG;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setPurchasePrice(purchasePrice);
        this.setSoldPrice(soldPrice);
    }

    public void describePhone() {
        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为" + brand + ",系统为" + os + ",硬件配置如下： \n" +
                "屏幕" + screenSize + "寸\n" +
                "cpu主频" + cpuHz + "Ghz\n" +
                "内存" + memoryG + "Gb\n" + "" +
                "储存空间" + storyG + "Gb\n");
    }
    public boolean meetCondition(){
        return true;
    }

    public double getScreenSize(){
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

    public int getStoryG() {
        return storyG;
    }

    public void setStoryG(int storyG) {
        this.storyG = storyG;
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
