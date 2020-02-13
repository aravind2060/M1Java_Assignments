package com.cpg.lab5.exercise3;

import java.util.Scanner;

public class MainControllerForPrimeNumbersPrinting 
{

	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Number :");
	       int n=scan.nextInt();
	       PrimeNumbersPrinting obj=new PrimeNumbersPrinting();  
	       obj.printPrimeNumbers(n);
	       scan.close();

	}

}
