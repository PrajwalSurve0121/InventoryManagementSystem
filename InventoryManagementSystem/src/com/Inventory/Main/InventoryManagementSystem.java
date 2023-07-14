package com.Inventory.Main;
import java.util.*;
import java.util.Scanner;

import com.Inventory.Controller.InventoryController;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InventoryController i=new InventoryController();
		char c;
		do 
		{
			System.out.println("Welcome Inventory Management System Please Enter the Choice from list");
			System.out.println("1.Add Product\n2.Remove Product\n3.Update Product\n4.Search Product\n5.Display Product\n6.Search By Category\n7.Display Total Value\n8.Grand Total");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: i.Operation(choice);
			break;
			case 2: i.Operation(choice);
			break;
			case 3: i.Operation(choice);
			break;
			case 4: i.Operation(choice);
			break;
			case 5: i.Operation(choice);
			break;
			case 6: i.Operation(choice);
			break;
			case 7: i.Operation(choice);
			break;
			case 8: i.Operation(choice);
			break;
			default :System.out.println("Invalid Choice");
			}
			System.out.println(".......................Do You Want To Continue...............");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');
	}

}
