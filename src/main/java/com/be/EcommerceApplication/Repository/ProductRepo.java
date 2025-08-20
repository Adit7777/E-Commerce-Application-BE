package com.be.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.EcommerceApplication.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
