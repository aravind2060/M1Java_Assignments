package com.cpg.lab5.exercise4;

import java.util.Scanner;

public class MainControllerForCheckingFirstNameAndLastName {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter FirstName:");
       String firstName=scan.nextLine();
       System.out.println("Enter LastName:");
       String lastName=scan.nextLine();
       CheckingFirstNameAndLastName obj=new CheckingFirstNameAndLastName();
       obj.checkForFirstNameAndLastName(firstName, lastName);
      scan.close();
	}

}
