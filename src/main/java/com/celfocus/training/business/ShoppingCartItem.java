package com.celfocus.training.business;

public class ShoppingCartItem {

    private ItemInfo itemInfo;
    private int quantity;
    private double discount;

    public ShoppingCartItem(ItemInfo itemInfo, int quantity, double discount) {
        this.itemInfo = itemInfo;
        this.quantity = quantity;
        this.discount = discount;
    }

    public ShoppingCartItem() {

    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity =  this.quantity + quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
