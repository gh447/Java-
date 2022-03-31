package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {
    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    public Phone(String name, String id, int count, double soldPrice, double purchasePrice,
                 double screenSize, double cpuHz, int memoryG, int storageG, String brand, String os) {
        this.screenSize = screenSize;
        this.cpuHz = cpuHz;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }
    public void describePhone(){
        System.out.println("此手机属性如下");
        describe();
        System.out.println("手机厂商为"+brand+",系统为"+os+",硬件配置如下：\n"+
                "屏幕"+screenSize+"寸\n"+
                "cpu主频"+cpuHz+"Hz\n"+
                "运行内存"+memoryG+"Gb\n"+
                "储存"+storageG+"Gb");
    }

    public boolean meetCondition(){
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
