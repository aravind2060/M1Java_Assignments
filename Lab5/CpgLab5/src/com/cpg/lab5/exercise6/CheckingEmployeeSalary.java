package com.cpg.lab5.exercise6;

import com.cg.eis.exception.EmployeeException;

public class CheckingEmployeeSalary
{
	Employee emp;
	public CheckingEmployeeSalary(Employee emp)
	{
		this.emp=emp;
	}
  public void validateEmployee()
  {
	  try
	  {
		  if(emp.salary<3000)
			throw new EmployeeException("Salary should be given more than 3000");
		  else
			  System.out.println("Ok he is an Employee");
	  }
	  catch(EmployeeException e)
	  {
		  e.displayError();
	  }
  }
}
