package com.geekbang.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    /**
     * 初始化小超市
     * @param superMarketName
     * @param address
     * @param parkingCount
     * @param merchandiseCount 商品种类数
     * @param count  每种商品缺省库存
     */
    public void init(String superMarketName, String address, int parkingCount, int merchandiseCount,
                     int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        merchandises = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.id = "id" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            merchandises[i] = m;
        }
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

    public double getIncomingSum() {
        return incomingSum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public void setMerchandises(MerchandiseV2[] merchandises) {
        this.merchandises = merchandises;
    }

    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }

    /**
     * 得到利润最高的商品
     * @return
     */
    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null || m.soldPrice - m.purchasePrice > curr.soldPrice - curr.purchasePrice) {
                curr = m;
            }
        }
        return curr;
    }


    /**
     * 根据索引获取商品
     *
     * @param merchandiseIndex
     * @return
     */
    public MerchandiseV2 getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }


    /**
     * 赚钱
     *
     * @param toBeAdded
     */
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum += toBeAdded;
    }


    /**
     * 花钱
     *
     * @param toBeSpent
     * @return
     */
    public boolean spendMoney(double toBeSpent) {
        if (toBeSpent > incomingSum) {
            return false;
        }
        this.incomingSum -= toBeSpent;
        return true;
    }

}
