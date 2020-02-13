package com.cpg.lab5.exercise6;

import java.util.Scanner;

public class MainControllerForCheckingEmployeeSalary {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		int salary=scan.nextInt();
			
		CheckingEmployeeSalary obj=new CheckingEmployeeSalary(new Employee(salary));
		 obj.validateEmployee();
		scan.close();

	}

}
