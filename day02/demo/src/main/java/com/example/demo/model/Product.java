package com.example.demo.model;

public class Product {
    
    private String name;
    private String seller;
    private int quantity;
    private long price;
    private String imageUrl;

    public Product(String name, String seller, int quantity, long price, String imageUrl){
        this.name = name;
        this.seller = seller;
        this.quantity = quantity;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getSeller(){return seller;}
    public void setSeller(String seller){this.seller=seller;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    public long getPrice(){return price;}
    public void setPrice(long price){this.price=price;}
    public String getImageUrl(){return imageUrl;}
    public void setImageUrl(String imageUrl){this.imageUrl=imageUrl;}
}
