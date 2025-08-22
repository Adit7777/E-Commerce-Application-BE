package com.be.EcommerceApplication.Service;

import java.util.List;

import com.be.EcommerceApplication.Model.Product;

public interface ProductService {

	public Product save(Product product);

	public List<Product> getAll();
}
