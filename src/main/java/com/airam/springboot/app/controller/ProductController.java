package com.airam.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airam.springboot.app.models.Product;
import com.airam.springboot.app.services.IProductService;

@RestController
@CrossOrigin

public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	//se asigna cual es el tipo
	@GetMapping(value = "/product/{idProduct}")
	public ResponseEntity<Product>findByProduct(@PathVariable String idProduct){
		
		Product product = new Product();
		
		product = productService.IdProduct(idProduct);
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	

}
