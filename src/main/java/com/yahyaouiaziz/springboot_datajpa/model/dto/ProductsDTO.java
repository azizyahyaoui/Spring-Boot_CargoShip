package com.yahyaouiaziz.springboot_datajpa.model.dto;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.enums.ProductsCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {

    private Long productId;
    private String productName ;
    private ProductsCategory productsCategory;
    private float price;
    private int stockQuantity;
}
