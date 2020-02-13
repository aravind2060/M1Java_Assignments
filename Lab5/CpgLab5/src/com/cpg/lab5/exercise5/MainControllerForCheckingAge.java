package com.cpg.lab5.exercise5;

import java.util.Scanner;

public class MainControllerForCheckingAge 
{

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=scan.nextInt();
		CheckingAge obj=new CheckingAge();
	     obj.validateAge(age);
		scan.close();
	}
}
