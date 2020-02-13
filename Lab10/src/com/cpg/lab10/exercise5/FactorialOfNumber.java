package com.cpg.lab10.exercise5;

public class FactorialOfNumber 
{

	public int getFactorial(int n)
	{
		
		FactorialInterface obj=FactorialOfNumber::fact;
		
		return obj.getFactorialOfNumber(n);
	}
    
	
  public static int fact(int n)
	{
		int mul=1;
		for(int i=n;i>1;i--)
		{
			mul=mul*i;
		}
		return mul;
	}
}
@FunctionalInterface
interface FactorialInterface
{
	abstract int getFactorialOfNumber(int a);
}