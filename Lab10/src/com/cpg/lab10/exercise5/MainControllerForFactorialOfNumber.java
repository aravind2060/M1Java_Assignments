package com.cpg.lab10.exercise5;

import java.util.Scanner;

public class MainControllerForFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		 FactorialOfNumber obj=new FactorialOfNumber();
		 System.out.println("Enter Number for factorial:");
		 int n=scan.nextInt();
		 System.out.println("Factroial of "+n+" is :"+obj.getFactorial(n));
		 scan.close();
	}

}
