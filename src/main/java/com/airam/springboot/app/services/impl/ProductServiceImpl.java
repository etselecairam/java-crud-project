package com.airam.springboot.app.services.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.airam.springboot.app.models.Product;
import com.airam.springboot.app.repository.ProductRepository;
import com.airam.springboot.app.services.IProductService;


@Service("productService")

public class ProductServiceImpl implements IProductService {
	//traemos el repository para usar sus funciones	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product IdProduct(String idProduct) {
		
		Product product = null;
		
		//para manejar errores
		try {
			product = productRepository.findById(idProduct);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return product;
	}
	
	@Override
	public Product save(Product entity) {
		//nuevo objeto producto
		Product product = null;
		//por si hay errores, que no falle todo
		try {
			
			product = productRepository.save(entity);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	@Override
	public List<Product> findAll() {
		
		List<Product> lstProducts = new ArrayList<Product>();

		try {
			lstProducts = productRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lstProducts;
	}

	@Override
	public Product update(Product entity) {
		
		Product product = null;
		
		try {
			product = productRepository.save(entity);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public Product deleteById(String idProducto) {
		
		Product product = null;
		
		try {
			product = productRepository.deleteById(idProducto);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return product;
	}

}
