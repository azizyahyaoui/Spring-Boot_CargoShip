package com.yahyaouiaziz.springboot_datajpa.services;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.Products;
import com.yahyaouiaziz.springboot_datajpa.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServices {

    private final ProductsRepository productsRepository;

 public List<Products> getAllProducts(){
     return productsRepository.findAll();
 }

}
