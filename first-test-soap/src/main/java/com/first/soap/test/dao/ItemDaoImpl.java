package com.first.soap.test.dao;

import com.first.soap.test.model.Item;
import com.first.soap.test.model.ItemList;

public class ItemDaoImpl {
	
	ItemList list = new ItemList();
	
	public ItemList getItems() {
		
		return list.putItems();
		
	}
	
	public Item insertItem(Item item){
		list.addItem(item);
		return item;
	}
	
	

}
