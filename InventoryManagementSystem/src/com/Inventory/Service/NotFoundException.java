package com.Inventory.Service;

public class NotFoundException extends RuntimeException{
	
	public NotFoundException()
	{
		super();
	}
	public NotFoundException(String ms)
	{
		super(ms);
	}

	
}
