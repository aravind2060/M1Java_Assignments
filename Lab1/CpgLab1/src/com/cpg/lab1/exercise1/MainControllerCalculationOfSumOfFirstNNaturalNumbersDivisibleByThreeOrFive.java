package com.cpg.lab1.exercise1;
import java.util.Scanner;
public class MainControllerCalculationOfSumOfFirstNNaturalNumbersDivisibleByThreeOrFive {

	public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
	 CalculationOfSumOfFirstNNaturalNumbersDivisibleByThreeOrFive obj=new CalculationOfSumOfFirstNNaturalNumbersDivisibleByThreeOrFive();
	 System.out.println("Enter N value:");
	 System.out.println(obj.calculateSum(scan.nextInt()));
	 scan.close();
	}
	

}
