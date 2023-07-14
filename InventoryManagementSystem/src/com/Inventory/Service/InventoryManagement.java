package com.Inventory.Service;

public interface InventoryManagement {
	
	public Product addProduct(Product pr);
	public int removeProduct(int pid);
	public int updateProduct(int pid);
	public String searchProduct(String pname);
	public void displayProduct();
	public String searchByCategory(String cname);
	public int displaytotalValue(int pid);
	public void GrandTotal();

}
