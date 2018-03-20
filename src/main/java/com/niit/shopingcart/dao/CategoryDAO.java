package com.niit.shopingcart.dao;

import java.util.List;

import com.niit.shopingcart.domain.Category;


//DAO -> Data Access Object
public interface CategoryDAO {
	
	//declare the methods.
	
	//create new category
	
	public boolean save(Category category);
	
	
	//update the existing category
	
	public boolean update(Category category);
	
	
	//get the category details
	
	public   Category     get(String id);
	
	
	//delete the category
	
	public   boolean    delete(String id);
	
	//to get all the categorys
	public List<Category>   list();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
