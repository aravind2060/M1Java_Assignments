package com.cpg.lab2.concreteclasses;

import com.cpg.lab2.abstractclasses.AbstractMediaItem;

public class Video extends AbstractMediaItem
{
  private String director,genre,yearreleased;
    public Video(String director,String genre,String yearreleased,String title,int identificationNumber,int noOfCopies,int runTime)
    {
    	super(identificationNumber,noOfCopies,title,runTime);
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
