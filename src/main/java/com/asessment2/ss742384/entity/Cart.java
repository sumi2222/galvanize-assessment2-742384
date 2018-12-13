package com.asessment2.ss742384.entity;

public class Cart {

    int cart_id;
    int product_id;
    int lineItem_Id;
    int totalItems;
    Double totalPrice;

    public Cart(int cart_id, int product_id, int lineItem_Id, int totalItems, Double totalPrice) {
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.lineItem_Id = lineItem_Id;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setLineItem_Id(int lineItem_Id) {
        this.lineItem_Id = lineItem_Id;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getCart_id() {
        return cart_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getLineItem_Id() {
        return lineItem_Id;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", product_id=" + product_id +
                ", lineItem_Id=" + lineItem_Id +
                ", totalItems=" + totalItems +
                ", totalPrice=" + totalPrice +
                '}';
    }


}
