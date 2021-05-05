package com.te.ecommercespringrest.dao;

import java.util.List;

import com.te.ecommercespringrest.beans.AdminBean;
import com.te.ecommercespringrest.beans.Items;

public interface AdminDAO {

public AdminBean authenticate(Integer id, String password);
	
	public boolean addItem(Items item);
	
	public boolean removeItem(Integer id);
	
	public Items searchItem(Integer id);
	
	public List<Items> getAllItems();
	
	public boolean updateItem(Items item);
}

