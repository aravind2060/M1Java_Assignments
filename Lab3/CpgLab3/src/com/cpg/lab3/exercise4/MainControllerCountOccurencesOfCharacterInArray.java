package com.cpg.lab3.exercise4;

import java.util.Scanner;

public class MainControllerCountOccurencesOfCharacterInArray {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of character array");
	     int n=scan.nextInt();
	     char arr[]=new char[n];
	     System.out.println("Enter Elements in character array:");
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=scan.next().charAt(0);
	     }
	     CountOccurencesOfCharacterInArray obj=new CountOccurencesOfCharacterInArray();
	     obj.countNoOfCharactersInArray(arr);
	     scan.close();
	}

}
