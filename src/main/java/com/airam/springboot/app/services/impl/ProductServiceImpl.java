package com.airam.springboot.app.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airam.springboot.app.models.Product;
import com.airam.springboot.app.repository.ProductRepository;
import com.airam.springboot.app.services.IProductService;

@Service("productService")

public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product IdProduct(Integer idProduct) {
		
		Product product = null;
		
		//para manejar errores
		try {
			product = productRepository.findById(idProduct).get();
			
		} catch (Exception e) {
			
		}
		
		return product;
	}

}
