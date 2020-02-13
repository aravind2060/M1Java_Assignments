package com.cpg.lab1.exercise1;

public class CalculationOfSumOfFirstNNaturalNumbersDivisibleByThreeOrFive 
{
   public int calculateSum(int n)
   {
	   int sum=0;
	   for(int index=1;index<=n;index++)
		{
			if(index%3==0 || index%5==0)
				sum=sum+index;
		}
	   return sum;
   }
}
