package com.first.soap.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemList {
	
	@XmlElement(name="Item")
	private List<Item> itemList = new ArrayList<Item>();
	
	public ItemList() { 
		super();
	}

	public ItemList addItem(Item item) {
		this.itemList.add(item);
		return this;
	}
	
	public void cleanItemList() {
		this.itemList.clear();
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	public ItemList putItems(){
		
		cleanItemList();
		this.addItem(new Item(1L, "Item-1"))
			.addItem(new Item(2L, "Item-2"))
			.addItem(new Item(3L, "Item-3"))
			.addItem(new Item(4L, "Item-4"));
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((itemList == null) ? 0 : itemList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemList other = (ItemList) obj;
		if (itemList == null) {
			if (other.itemList != null)
				return false;
		} else if (!itemList.equals(other.itemList))
			return false;
		return true;
	}
	
	
	

}
