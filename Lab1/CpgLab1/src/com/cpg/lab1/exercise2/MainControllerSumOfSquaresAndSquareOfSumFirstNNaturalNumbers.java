package com.cpg.lab1.exercise2;

import java.util.Scanner;

public class MainControllerSumOfSquaresAndSquareOfSumFirstNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SumOfSquaresAndSquareOfSumFirstNNaturalNumbers obj=new SumOfSquaresAndSquareOfSumFirstNNaturalNumbers();
		System.out.println("Enter Number:");
	     System.out.println(obj.calculateDifference(scan.nextInt()));
	     
	     scan.close();
	}

}
