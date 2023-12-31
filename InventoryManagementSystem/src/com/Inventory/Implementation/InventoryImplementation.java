package com.Inventory.Implementation;
import java.util.*;

import com.Inventory.Service.Category;
import com.Inventory.Service.InventoryItem;
import com.Inventory.Service.InventoryManagement;
import com.Inventory.Service.NotFoundException;
import com.Inventory.Service.Product;

public class InventoryImplementation implements InventoryManagement{
	
	Product pr=new Product();
	Category c=new Category();
	InventoryItem in=new InventoryItem();
	Scanner sc=new Scanner(System.in);

	ArrayList<Product>list=new ArrayList<>();
	ArrayList<InventoryItem>list2=new ArrayList<>();
	@Override
	public Product addProduct(Product pr) {
		// TODO Auto-generated method stub
		System.out.println("Enter Product Number to add");
		int length=sc.nextInt();
		for(int i=1;i<=length;i++)
		{
			
			System.out.println("...................Enter Product Details..........");
			System.out.println("Enter Product Id: ");
			int pid=sc.nextInt();
			System.out.println("Enter Product Name: ");
			String pname=sc.next();
			System.out.println("...................Enter Quantity Details....................");
			System.out.println("Enter Quantity of product");
            int quan=sc.nextInt();
			System.out.println("...................Enter Category Details....................");
			System.out.println("Enter Category Id: ");
			int cid=sc.nextInt();
			System.out.println("Enter Category of Product name");
			String cname=sc.next();
			System.out.println("Enter Price of product:");
			int price=sc.nextInt();
			
			Product p=new Product(pid,pname,new Category(cid,cname),price);
			
			InventoryItem z=new InventoryItem(p,quan);
			list.add(p);
			list2.add(z);
		}
		
		return pr;
	}



	@Override
	public int removeProduct(int pid) {
		// TODO Auto-generated method stub
		System.out.println("Enter Product id to romove product");
		pid=sc.nextInt();
		if(list.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean ispresent=false;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPid()==pid)
			{
				ispresent=true;
				break;
			}
			
			
		}
		if(ispresent==true)
		{
			for(int j=0;j<list.size();j++)
			{
				if(list.get(j).getPid()==pid)
				{
					list.remove(j);
					System.out.println("Removed Sucessfully");
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
		
		return pid;
	}



	@Override
	public int updateProduct(int pid) {
		// TODO Auto-generated method stub
		System.out.println("Enter Product Id to update Price:");
		pid=sc.nextInt();
		if(list.isEmpty())
		{
			throw new NotFoundException();
		}
		
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPid()==pid)
			{
				System.out.println("Enter new product price: ");
				
				
				int pri=sc.nextInt();
				Product p=new Product(list.get(i).getPid(),list.get(i).getPname(),list.get(i).getCat(),pri);
				list.set(i, p);
				
			}
		}
		
		return pid;
	}



	@Override
	public String searchProduct(String pname) {
		// TODO Auto-generated method stub
		System.out.println("Enter product name for search");
		pname=sc.next();
		if(list.isEmpty())
		{
			throw new NotFoundException(); 
		}
		boolean pNamePresent=false;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPname().equalsIgnoreCase(pname))
			{
				pNamePresent=true;
				break;
			}
		}
		if(pNamePresent==true)
		{
			for(int j=0;j<list.size();j++)
			{
				if(list.get(j).getPname().equalsIgnoreCase(pname))
				{
					System.out.println("The Product name is: "+pname+"= "+list.get(j).getPid()+
							" "+list.get(j).getPname()+" "+list.get(j).getCat().getCid()+
							" "+list.get(j).getCat().getCname()+" "+list.get(j).getPrice());
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
		return pname;
	}



	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		System.out.println("Display Product list");
		try {
			if(list.isEmpty())
			{
				throw new NullPointerException();
			}
		}
		catch(NullPointerException n)
		{
			System.out.println(n.getLocalizedMessage());
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Product Details: "+list.get(i).getPid()+
			" "+list.get(i).getPname()+" "+list.get(i).getCat().getCid()+
			" "+list.get(i).getCat().getCname()+" "+list.get(i).getPrice());
		}
	}



	@Override
	public String searchByCategory(String cname) {
		// TODO Auto-generated method stub
		System.out.println("Search Product By its Category: ");
		System.out.println("Enter Category for search: ");
		cname=sc.next();
		if(list.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean ispresent=false;
		for(int i=1;i<list.size();i++)
		{
			if(list.get(i).getCat().getCname().equalsIgnoreCase(cname))
			{
				ispresent=true;
				break;
			}
			
		}
		if(ispresent==false)
		{
			for(int j=1;j<list.size();j++)
			{
				if(list.get(j).getCat().getCname().equalsIgnoreCase(cname))
				{
					System.out.println("The Category of Product is: "+cname+" "+list.get(j).getPid()+
							" "+list.get(j).getPname()+" "+list.get(j).getCat().getCid()+
							" "+list.get(j).getCat().getCname()+" "+list.get(j).getPrice());
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
		return cname;
	}



	@Override
	public int displaytotalValue(int pid) {
		// TODO Auto-generated method stub
//		int pr=sc.nextInt();
		System.out.println("Enter Product ID For check: ");
		pid=sc.nextInt();
		int total=0;
		if(list.isEmpty())
		{
			throw new NotFoundException();
		}
		int i;
		boolean isPresent=false;
		for(i=0;i<list.size();i++)
		{
			if(list.get(i).getPid()==pid)
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent==true)
		{
			total=total+list.get(i).getPrice()*list2.get(i).getQuantity();
		}
		return total;
		
	}
	
	@Override
	public void GrandTotal()
	{
		int GreanTotal=0;
		for(int i=0;i<list2.size();i++)
		{
			GreanTotal=GreanTotal+list2.get(i).getQuantity()*list2.get(i).getPr().getPrice();
		}
		System.out.println("Grand Total is: "+GreanTotal);
	}
	
}

