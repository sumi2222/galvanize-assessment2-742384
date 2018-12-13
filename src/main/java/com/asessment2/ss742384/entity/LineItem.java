package com.asessment2.ss742384.entity;

public class LineItem {
    int lineItem_id;
    int product_id;
    boolean  discounted_product;


    public LineItem(int lineItem_id, int product_id, boolean discounted_product) {
        this.lineItem_id = lineItem_id;
        this.product_id = product_id;
        this.discounted_product = discounted_product;
    }



    public void setLineItem_id(int lineItem_id) {
        this.lineItem_id = lineItem_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setDiscounted_product(boolean discounted_product) {
        this.discounted_product = discounted_product;
    }

    public int getLineItem_id() {
        return lineItem_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public boolean isDiscounted_product() {
        return discounted_product;
    }


    @Override
    public String toString() {
        return "LineItem{" +
                "lineItem_id=" + lineItem_id +
                ", product_id=" + product_id +
                ", discounted_product=" + discounted_product +
                '}';
    }



}
