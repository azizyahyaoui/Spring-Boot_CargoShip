package com.yahyaouiaziz.springboot_datajpa.repositories;

import com.yahyaouiaziz.springboot_datajpa.model.entities.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductsRepository extends JpaRepository<Products,Long> {
}
