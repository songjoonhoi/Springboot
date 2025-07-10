package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
@RequestMapping("/shop")
public class ShopController {

    private List<Product> products = new ArrayList<>();

    public ShopController() {
        products.add(new Product("게이밍 노트북", "ABC 전자", 10, 1800000, "/images/laptop.jpg"));
        products.add(new Product("최신 스마트폰", "XYZ 통신", 50, 1200000, "/images/smartphone.jpg"));
        products.add(new Product("무선 헤드폰", "음향 기어", 100, 250000, "/images/headphone.jpg"));
        products.add(new Product("스마트 워치", "건강 기술", 30, 300000, "/images/smartwatch.jpg"));
    }

    @GetMapping("/list")
    public String showProductList(Model model) {
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/detail/{productName}")
    public String showProductDetail(@PathVariable("productName") String productName, Model model) {
        Product foundProduct = null;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            model.addAttribute("product", foundProduct);
            return "product-detail";
        } else {
            return "redirect:/shop/list";
        }
    }

    @GetMapping("/")
    public String redirectToShopList() {
        return "redirect:/shop/list";
    }
}
