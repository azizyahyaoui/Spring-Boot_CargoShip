package com.yahyaouiaziz.springboot_datajpa.controllers;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.Products;
import com.yahyaouiaziz.springboot_datajpa.services.ProductsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsServices productsServices;

    @GetMapping("/products")
    public List<Products> fetchAllProducts(){
        return productsServices.getAllProducts();
    }

    @GetMapping("/products-{id}")
    public String fetchProductsById(@PathVariable int id){
        return "this all your products " + id + " is : a soap";
    }

}
