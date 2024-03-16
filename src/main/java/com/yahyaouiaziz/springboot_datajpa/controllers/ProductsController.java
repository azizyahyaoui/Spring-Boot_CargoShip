package com.yahyaouiaziz.springboot_datajpa.controllers;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.Products;
import com.yahyaouiaziz.springboot_datajpa.services.ProductsServices;
import jakarta.persistence.PostUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/products-by-id-{id}")
    public String fetchProductsById(@PathVariable long id){
        return "this all your products " + id + " is : a soap";
    }

    @PutMapping("/update_products-by-id-{id}")
    public String UpdateProductsById(@PathVariable long id,Products products) {
        return "update ..";
    }

    @DeleteMapping("/delete_products-by-id-{id}")
    public void deleteProductsById(@PathVariable long id){
        productsServices.deleteProducts(id);
    }

}
