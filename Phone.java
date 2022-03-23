package com.geekbang.supermarket;

public class Phone extends MerchandiseV2{
    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    public Phone(String name,String id,int count,double soldPrice ,double purchasePrice,
                 double screenSize,double cpuHz,int memoryG,int storageG,String brand,String os){
        this.brand = brand;
        this.cpuHz =cpuHz;
        this.screenSize = screenSize;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.os = os;

        this.setName(name);
        this.setCount(count);
        this.setId(id);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }
    //>>TODO 通过使用和父类签名一样，而且返回值也必须一样的方法，可以让子类覆盖掉父类的方法
    //>>TODO (重要) 也就是说，子类不只是只能将父类的方法拿过来，还能通过覆盖来替换掉不适合子类的方法
    //>>TODO 题外话，属性是联动的，可能有特殊意义的，
    //  TODO 所以直接给属性赋值是危险的，因为没办法检查新的值是否有意义，也没办法对这个修改做联动的修改

    public double buy(int count){
        //TODO 这个方法里代码大部分跟父类一样，肯定有办法解决
        if (count > MAX_BUY_ONE_ORDER){
            System.out.println("购买失败，一次只能购买"+MAX_BUY_ONE_ORDER+"个");
            return -2;
        }
        if (this.count<count){
            System.out.println("购买失败，库存不足");
            return  -1;
        }
        this.count -= count;
        double totalCost = count*soldPrice;
        System.out.println("购买成功，花费为"+totalCost);
        return totalCost;
    }
    //TODO 返回值必须一模一样，不是类型兼容，而是必须一模一样，如果签名一样，返回值不一样会是错误



    //>>TODO 覆盖可以覆盖掉父类的方法。同一个方法不同的行为
    //>>TODO 这就是多态
    //>>TODO 方法可以覆盖，但是属性访问不可以，所以这也是使用方法而不是属性的额一个原因。
    //  TODO 即使在父类里，只是一个简单地getName，但是这样做，在有需要的时候子类就能覆盖掉父类的方法
    //  TODO 方法不止眼前的代码，还有子类的覆盖，用方法才能覆盖，才能多态

    public String getName(){
        return this.brand+":"+this.os+":"+name;
    }

    //TODO 根据我们对覆盖的理解，Phone类里的describePhone方法应该叫做describe
    //TODO 同样的，我们想要调用父类里的describe方法，试试看？
    public void describePhone(){
        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为"+brand+";系统为"+os+";硬件配置如下：\n"+
                "屏幕："+screenSize+"寸\n"+
                "cpu主频"+cpuHz+"Ghz\n"+
                "内存"+memoryG+"Gb\n"+
                "储存空间"+storageG+"Gb");
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
