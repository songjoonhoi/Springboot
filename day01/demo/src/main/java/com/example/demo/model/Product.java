package com.example.demo.model;

public class Product {
    
    private String productId;
    private String name;
    private long price;

    public Product(String prductId, String name, long price){
        this.productId = prductId;
        this.name = name;
        this.price = price;
    }

    public String getProductId(){return productId;}
    public void setProductId(String productId){this.productId=productId;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public long getPrice(){return price;}
    public void setPrice(long price){this.price=price;}
}
