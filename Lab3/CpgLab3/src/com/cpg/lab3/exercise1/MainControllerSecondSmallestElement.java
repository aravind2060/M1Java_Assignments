package com.cpg.lab3.exercise1;

import java.util.Scanner;

public class MainControllerSecondSmallestElement {

	public static void main(String[] args) 
	{
		int arr[];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int n=scan.nextInt();
		arr=new int[n];
		System.out.println("Enter Elements Of Array:");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		SecondSmallestElement obj=new SecondSmallestElement();
		System.out.println(obj.getSecondSmallestElementInArray(arr));
		scan.close();
	}

}
