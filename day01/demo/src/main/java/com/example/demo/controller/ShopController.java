package com.example.demo.controller;

import com.example.demo.model.Product;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/shop")
public class ShopController {
    private List<Product> products = new ArrayList<>();

    public ShopController(){
        products.add(new Product("1001", "노트북", 1200000));
        products.add(new Product("1002", "스마트폰", 1500000));
        products.add(new Product("1003", "아이패드", 2000000));
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Product> getProductList() {
        return products;
    }

    @GetMapping("/list/{productid}")
    @ResponseBody
    public  Product getProductDetail(@PathVariable("productid") String productId){
        for( Product product : products){
            if(product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    @GetMapping("/page/list")
    public String getProductListPage(){
        return "/shop/list";
    }
    
    
    
    
}
