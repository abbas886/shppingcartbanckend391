package com.niit.shopingcart.dao;

import java.util.List;

import com.niit.shopingcart.domain.Product;

//DAO -> Data Access Object
public interface ProductDAO {

	// declare the methods.

	// create new product

	public boolean save(Product product);

	// update the existing product

	public boolean update(Product product);

	// get the product details

	public Product get(String id);

	// delete the product

	public boolean delete(String id);

	// to get all the products
	public List<Product> list();

}
