package com.cpg.lab4.exercise1;

public class SumOfCubesOfNDigitNumber {

	public int getSumOfCubesOfNDigitNumber(int input)
	{
		int finalsum=0;
		while(input!=0)
		{
		  int temp=input%10;
		  finalsum+=temp*temp*temp;
		  input=input/10;
		}
		return finalsum;
	}
}
