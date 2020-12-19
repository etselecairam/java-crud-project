package com.airam.springboot.app.models;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class product implements Serializable {

	private static final long serialVersionUID = 2267426928408897992L;
	
	@MongoId(value = FieldType.OBJECT_ID)
	private String id;
	private String name;
	private String description;
	private String brand;
	private Double price; 
	private Integer quantity;
	private String category;
	
	
	

}
