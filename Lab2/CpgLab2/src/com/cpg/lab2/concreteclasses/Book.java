package com.cpg.lab2.concreteclasses;

import com.cpg.lab2.abstractclasses.AbstractWrittenItem;

public class Book extends AbstractWrittenItem{

	public Book(int identificationNumber, int noOfCopies, String title, String author) {
		super(identificationNumber, noOfCopies, title, author);
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void checkOut()
	{
	 System.out.println("Total No.of Copies:->"+this.getNoOfCopies());
	}
	
	@Override
	public void checkIn()
	{
		
	}
	@Override
	public void addItem()
	{
	   	
	}
	@Override
	public void print()
	{
		System.out.println("Book Author:"+this.getAuthor());
	}
	
	
}
