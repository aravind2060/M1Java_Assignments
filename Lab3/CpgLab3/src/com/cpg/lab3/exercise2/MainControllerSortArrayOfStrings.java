package com.cpg.lab3.exercise2;

import java.util.Scanner;

public class MainControllerSortArrayOfStrings 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size:");
		  int n=scan.nextInt();
		  String arr[]=new String[n];
		  System.out.println("Enter Elements of Array:");
		  for(int i=0;i<n;i++)
		  {
			 arr[i]=scan.nextLine(); 
		  }
		  SortArrayOfStrings obj=new SortArrayOfStrings();
		  String arrs[]=obj.getSortedArray(arr);
		    for(int i=0;i<arrs.length;i++)
		    	System.out.println(arrs[i]);
		  scan.close();

	}

}
