package com.cpg.lab2.abstractclasses;

public abstract class AbstractWrittenItem extends AbstractItem{

	private String author;
	public AbstractWrittenItem(int identificationNumber, int noOfCopies, String title,String author)
	{
		super(identificationNumber, noOfCopies, title);
		this.author=author;
	}
	
	public String getAuthor()
	{
		return this.author;
	}

}
