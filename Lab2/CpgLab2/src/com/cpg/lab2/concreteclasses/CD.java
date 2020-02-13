package com.cpg.lab2.concreteclasses;

import com.cpg.lab2.abstractclasses.AbstractMediaItem;

public class CD extends AbstractMediaItem
{
  private String artistName,genre;
  
     public CD(String artistName,String genre,int identificationNumber, int noOfCopies, String title,int runTime)
     {
    	 super(identificationNumber,noOfCopies,title,runTime);
    	 this.artistName=artistName;
    	 this.genre=genre;
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
