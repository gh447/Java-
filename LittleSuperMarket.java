package com.geekbang.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incoming;
    public MerchandiseV2[] merchandise;
    public int[] merchandiseSold;

    public void init(String superMarketName, String address, int parkingCount, int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.parkingCount = parkingCount;
        this.address = address;

        merchandise = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandise.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.id = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            m.count = count;
            merchandise[i] = m;
        }
        merchandiseSold = new int[merchandise.length];
    }

    public MerchandiseV2 getBiggestMerchandise() {
        MerchandiseV2 m = null;
        for (int i = 0; i < merchandise.length; i++) {
            if (m == null || m.soldPrice - m.purchasePrice < merchandise[i].soldPrice - merchandise[i].purchasePrice) {
                m = merchandise[i];
            }
        }
        return m;
    }

    //简单访问成员变量

    public String getSuperMarketName() {
        return superMarketName;
    }

    public String getAddress() {
        return address;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public double getIncoming() {
        return incoming;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }


}
