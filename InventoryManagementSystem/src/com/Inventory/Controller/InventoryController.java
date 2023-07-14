package com.Inventory.Controller;

import com.Inventory.Implementation.InventoryImplementation;
import com.Inventory.Service.NotFoundException;
import com.Inventory.Service.Product;

public class InventoryController {

	InventoryImplementation inv=new InventoryImplementation();
	
	public void Operation(int option)
	{
		String name=null;
		switch(option)
		{
		case 1: Product p=null;
		inv.addProduct(p);
		break;
		case 2: try {
			inv.removeProduct(option);
		}
		catch(NotFoundException n)
		{
			n.getLocalizedMessage();
		}
		break;
		case 3: try {
			inv.updateProduct(option);
		}
		catch(NotFoundException e)
		{
			e.getLocalizedMessage();
		}
		break;
		case 4: try
		{
			inv.searchProduct(name);
		}
		catch(NotFoundException l)
		{
			l.getLocalizedMessage();
		}
		break;
		case 5: try {
			inv.displayProduct();
		}
		catch(NullPointerException z)
		{
			z.getLocalizedMessage();
		}
		break;
		case 6: try
		{
			inv.searchByCategory(name);
		}
		catch(NotFoundException m)
		{
			m.getLocalizedMessage();
		}
		break;
		case 7: try {
			
			System.out.println(inv.displaytotalValue(option));
			
		}
		catch(NotFoundException x)
		{
			x.getLocalizedMessage();
		}
		break;
		case 8: inv.GrandTotal();
		break;
		default :System.out.println("Invalid Choice");
		
			
		}
		
	}

}
