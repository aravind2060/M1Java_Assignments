package com.cpg.lab5.exercise2;

import java.util.Scanner;

public class MainControllerForFibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FibonacciSeries obj=new FibonacciSeries();
		System.out.println("Fibonacci Series using Normal Function:"+obj.getNthFibonacciNumberUsingNormalFunction(scan.nextInt()));
		System.out.println("Fibonacci Series using Recursive method:"+obj.getNthFibonacciNumberUsingRecursiveMethod(scan.nextInt(),scan.nextInt(),scan.nextInt()));
		scan.close();

	}

}
