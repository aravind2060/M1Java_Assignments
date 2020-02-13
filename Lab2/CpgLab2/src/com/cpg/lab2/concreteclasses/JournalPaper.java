package com.cpg.lab2.concreteclasses;

import com.cpg.lab2.abstractclasses.AbstractWrittenItem;

public class JournalPaper extends AbstractWrittenItem 
{
    private String yearOfPublished;
    public JournalPaper(String yearOfPublished,int identificationNumber, int noOfCopies, String title,String author)
    {
    	super(identificationNumber,noOfCopies,title,author);
    	this.yearOfPublished=yearOfPublished;
    }
    @Override
	public void checkOut()
	{
		
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
		
	}
}
