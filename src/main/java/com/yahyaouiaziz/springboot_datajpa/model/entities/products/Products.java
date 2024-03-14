package com.yahyaouiaziz.springboot_datajpa.model.entities.products;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.enums.ProductsCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "product_id"
    )
    private Long productId;
    @NotBlank
    @Column(name = "product_name")
    private String productName ;
    @Enumerated(EnumType.STRING)
    private ProductsCategory productsCategory;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private ProductsProvider  ProductsProvider;


}
