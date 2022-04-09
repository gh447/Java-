package com.geekbang.supermarket.impl;

import com.geekbang.supermarket.interfaces.Card;
import com.geekbang.supermarket.interfaces.Customer;
import com.geekbang.supermarket.interfaces.ShoppingCart;

public enum VIPCard implements Card {
    Leve10(1),
    Leve11(0.99),
    Leve12(0.95),
    Leve13(0.9),
    Leve14(0.85),
    Leve15(0.8);

    private double discount;

    VIPCard(double discount) {
        this.discount = discount;
    }

    @Override
    public double processCardDiscount(double totalCost, double totalCostAfterDiscount, Customer customer, ShoppingCart shoppingCart) {
        return totalCostAfterDiscount * (1 - discount);
    }
}
