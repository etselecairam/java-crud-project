package com.airam.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.airam.springboot.app.models.Product;

@Repository("productRepository")
public interface ProductRepository extends MongoRepository<Product, Serializable> {

	Product findById(String id);
	
	Product deleteById(String id);
	
	//probar esto a ver
	//Product findByName(String name);
}


//acá se busca lo que le pidamos, en mongodb