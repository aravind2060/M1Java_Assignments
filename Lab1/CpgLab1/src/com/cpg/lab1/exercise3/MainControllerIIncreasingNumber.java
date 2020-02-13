package com.cpg.lab1.exercise3;

import java.util.Scanner;


public class MainControllerIIncreasingNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 
		 IncreasingNumber obj=new IncreasingNumber();
		 System.out.println("Enter Number:");
		  System.out.println(obj.checkIncreasingNumber(scan.nextInt()));
		 scan.close();
	}

}
