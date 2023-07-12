package com.Inventory.Service;

public class InventoryItem {
	
	private Product pr;
	private int quantity;


	public InventoryItem()
	{
		
	}
	public InventoryItem(Product pr, int quantity) {
		this.pr = pr;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "InventoryItem [pr=" + pr + ", quantity=" + quantity + "]";
	}

	public Product getPr() {
		return pr;
	}

	public void setPr(Product pr) {
		this.pr = pr;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
