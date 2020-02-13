package com.cpg.lab3.exercise3;

import java.util.Scanner;

public class MainControllerReverseNumberInArrayAndReturnInSortedOrder {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements:");
          for(int index=0;index<size;index++)
          {
        	 arr[index]=scan.nextInt(); 
          }
          ReverseNumberInArrayAndReturnInSortedOrder obj=new ReverseNumberInArrayAndReturnInSortedOrder();
           int output[]=obj.getSorted(arr);
           for(int i=0;i<output.length;i++)
        	   System.out.println(output[i]);
        scan.close();
	}

}
