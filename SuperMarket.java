package com.geekbang.supermarket.interfaces;

public interface SuperMarket {
    Merchandise [] getAllMerchandise();

    Merchandise [] getRandomMerchandiseCategory(Category category);

    void addEarnedMoney(double earnedMoney);

    void dailyReport();
}
