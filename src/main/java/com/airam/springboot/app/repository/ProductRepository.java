package com.airam.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.airam.springboot.app.models.Product;

@Repository("ProductRepository")
public interface ProductRepository extends MongoRepository <Product, Serializable> {

	Product findById(String id);
}
