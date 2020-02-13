package com.cpg.lab1.exercise4;

import java.util.Scanner;


public class MainControllerForPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		 int num=scan.nextInt();
		 PowerOfTwo obj=new PowerOfTwo();
		 System.out.print(obj.checkNumber(num));
		 scan.close();
	}

}
