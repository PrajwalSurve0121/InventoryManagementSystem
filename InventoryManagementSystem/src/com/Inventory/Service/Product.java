package com.Inventory.Service;

public class Product {

	private int pid;
	private String pname;
	private Category cat;
	private int price;
	
	public Product()
	{
		
	}
	
	public Product(int pid, String pname, Category cat, int price) {
		this.pid = pid;
		this.pname = pname;
		this.cat = cat;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
