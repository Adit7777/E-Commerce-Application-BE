package com.be.EcommerceApplication.Controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.EcommerceApplication.Model.Product;
import com.be.EcommerceApplication.Service.ProductService;

@RestController
@RequestMapping("/ecommerce/product")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		product.setCreatedDate(LocalDateTime.now());
		product.setStatus("Active");
		Product result  = productService.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

}
