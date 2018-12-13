package com.asessment2.ss742384.service;

import com.asessment2.ss742384.entity.Cart;
import com.asessment2.ss742384.entity.LineItem;
import com.asessment2.ss742384.entity.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CartService {

    List<LineItem> lineItemList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Cart> cartList = new ArrayList<>();
    private int totalCartItem = 0;
    private Double totalShoppingPrice;

    public void addNewLineItems(){
        System.out.println(" Add Line items, press stop to stop and continue to continue - " );
        String anymore = "continue";
        boolean discounted_product = false;
        int product_id = 0;
        int autoIncId = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
            while(anymore.equalsIgnoreCase("continue")) {
                System.out.println("Is that discounted product, press true or false : ");
                discounted_product = Boolean.parseBoolean(reader.readLine());
                System.out.println("Product Id : ");
                product_id = Integer.parseInt(reader.readLine());
                LineItem item = new LineItem(autoIncId, product_id,discounted_product );
                lineItemList.add(item);
                System.out.println(" Add Line items, press stop to stop and continue to continue - " );
                anymore= reader.readLine();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    public void addNewProducts(){
        System.out.println(" Add new products, press stop to stop and continue to continue - " );
        String anymore = "continue";
        boolean discounted_product = false;
        String product_name = null;
        Double product_price = 0.0;
        int autoIncId = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(anymore.equalsIgnoreCase("continue")) {
                System.out.println("Add product name : ");
                product_name = reader.readLine();
                System.out.println("Product price : ");
                product_price = Double.parseDouble(reader.readLine());
                Product product = new Product(autoIncId+1, product_name, product_price );
                productList.add(product);
                System.out.println(" Add Line items, press stop to stop and continue to continue - " );
                anymore= reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addCartItems() {
        System.out.println(" Add cart items, press stop to stop and continue to continue - ");
        String anymore = "continue";
        int lineItem_Id = 0;
        int product_id = 0;
        int autoIncId = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (anymore.equalsIgnoreCase("continue")) {
                System.out.println("LineItem-Id : ");
                lineItem_Id = Integer.parseInt(reader.readLine());
                System.out.println("Product Id : ");
                product_id = Integer.parseInt(reader.readLine());
                totalShoppingPrice = productList.get(product_id).getProduct_price();
                Cart cart = new Cart(autoIncId, product_id, lineItem_Id, totalCartItem++, totalShoppingPrice);
                cartList.add(cart);
                System.out.println(" Add Line items, press stop to stop and continue to continue - ");
                anymore = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void displayItems(){
        int count  = 0;
        for(LineItem items :lineItemList ){
            System.out.println(" LineItem number - " +count + " :: " +items);
        }
    }
}
