package com.geekbang.supermarket;

public class ShellColorChangePhone extends Phone{
    private boolean enableShellColorChange;

    public ShellColorChangePhone(String name,String id,int count,double soldPrice,double purchasePrice,
                                 double screenSize,double cpuHz,int memoryG,int storageG,String brand,String os){
        super(name,id,count,soldPrice,purchasePrice,screenSize,cpuHz,memoryG,storageG,brand,os);
        enableShellColorChange = false;
    }
    public boolean isEnableShellColorChange(){
        return enableShellColorChange;
    }

    public void setEnableShellColorChange(boolean enableShellColorChange) {
        this.enableShellColorChange = enableShellColorChange;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("手机壳颜色随着屏幕色变的功能开启状态："+enableShellColorChange);
    }
    public double calculateProfit(){
        //厂家提供10和点的返点
        return super.calculateProfit()+super.getPurchasePrice()*0.8;
    }
}
