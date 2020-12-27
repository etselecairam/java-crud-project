package com.airam.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airam.springboot.app.models.Product;
import com.airam.springboot.app.services.IProductService;

@CrossOrigin
@RestController

public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	//POST: crea un nuevo producto
	@PostMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> save(@RequestBody Product product) {
		Product productData = productService.save(product);
		
		return ResponseEntity.ok(productData);
	}
	
	//GET lista de productos guardados
	@GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findAll() {
		//nueva lista de productos
		List<Product> products = new ArrayList<Product>();
		
		//llamo al servicio
		products = productService.findAll();
		
		return ResponseEntity.ok(products);
		
	}
	
	//datos de un solo producto
	@GetMapping(value = "/product/{idProduct}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> findByProduct(@PathVariable String idProduct){
		// nuevo objeto producto
		Product product = new Product();
		//se busca el id del producto
		product = productService.IdProduct(idProduct);
		
		return ResponseEntity.ok(product);
	}
	
	//PUT: modificación
	@PutMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		//paso nuevos datos llamando al servicio
		Product productData = productService.save(product);
		//se muestran los datos actualizados
		return ResponseEntity.ok(productData);
	}
	
	//DELETE por id un producto
	@DeleteMapping(value = "/product/{idProduct}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> deleteFindByIdProduct(@PathVariable String idProduct) {
		//nuevo objeto producto
		Product product = new Product();
		//le digo al servicio que id borrar
		product = productService.deleteById(idProduct);
		
		return ResponseEntity.ok(product);
	}

}
