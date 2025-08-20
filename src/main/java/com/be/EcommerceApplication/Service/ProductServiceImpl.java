package com.be.EcommerceApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.be.EcommerceApplication.Model.Product;
import com.be.EcommerceApplication.Repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo prodRepo;
	
	@Override
	public Product save(Product product) {
		Product result = prodRepo.save(product);
		return result;
	}

	
}
