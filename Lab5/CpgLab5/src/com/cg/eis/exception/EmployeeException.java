package com.cg.eis.exception;

import java.io.Serializable;

public class EmployeeException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4219169977034587520L;
    String Log;
	public EmployeeException(String error)
	{
		this.Log=error;
	}
	public void displayError()
	{
		System.out.println(this.Log);
	}
}
