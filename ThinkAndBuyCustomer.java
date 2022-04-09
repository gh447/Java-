package com.geekbang.supermarket.impl;

import com.geekbang.supermarket.interfaces.Card;
import com.geekbang.supermarket.interfaces.Category;
import com.geekbang.supermarket.interfaces.HasCard;
import com.geekbang.supermarket.interfaces.Merchandise;

public class ThinkAndBuyCustomer extends AbsCustomer implements HasCard {
    private Card card = VIPCard.Leve10;

    public ThinkAndBuyCustomer(String custId, Category shouldBuy) {
        super(custId, shouldBuy, DEFAULT_GUANG_COUNT);
    }

    @Override
    public int buyMerchandise(Merchandise merchandise) {
        Category category = merchandise.getCategory();
        //需要买就买一个
        if (category == getShouldBuy()) {
            return 1;
        }

        double soldPrice = merchandise.getSoldPrice();

        double avgPrice = ((category.getHigherPrice() + category.getLowerPrice() )/ 2);
        if (soldPrice<avgPrice){
            return 1;
        }else {
            return 0;
        }
    }
    public void setCard(Card card){
        this.card = card;
    }
    public Card getCard(){
        return card;
    }
}
