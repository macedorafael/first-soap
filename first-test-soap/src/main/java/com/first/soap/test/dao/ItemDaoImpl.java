package com.first.soap.test.dao;

import com.first.soap.test.model.ItemList;

public class ItemDaoImpl {
	
	ItemList list = new ItemList();
	
	public ItemList getItems(){
		list.putItems();
		return list;
	}
	
	

}
