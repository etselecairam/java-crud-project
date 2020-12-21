package com.airam.springboot.app.services;

import java.util.List;

import com.airam.springboot.app.models.Product;

public interface IProductService {

	public abstract Product IdProduct(String idProduct);
	
	public abstract Product save(Product entity);
	
	public abstract List<Product> findAll();
	
	public abstract Product update(Product entity);
	
	public abstract Product deleteById(String idProduct);
}
