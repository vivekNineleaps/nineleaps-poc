package com.nineleaps.supplier.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private ProductPrimaryKey pk;
	private String name;
	private Double price ;
	private String description;
}
