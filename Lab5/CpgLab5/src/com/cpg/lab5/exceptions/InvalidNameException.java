package com.cpg.lab5.exceptions;

public class InvalidNameException extends Exception implements java.io.Serializable
{
	/**
	 * At the date of 24-01-2020 
	 * Where only checking for first name and last name
	 */
	private static final long serialVersionUID = -4879889017953415536L;
  
	String Log;
	public InvalidNameException(String ErrorMsg)
	{
		this.Log=ErrorMsg;
	}
	public void displayError()
	{
		System.out.println(this.Log);
	}
}
