package com.cpg.lab5.exercise2;

public class FibonacciSeries {

	public int getNthFibonacciNumberUsingNormalFunction(int n)
	{
	  int NthDigit=0,first=1,second=1,temp=0;
	  for(int i=0;i<n-2;i++)
	  {
		   temp=first+second;
		  first=second;
		  second=temp;
	  }
	   NthDigit=temp;
	  return NthDigit;
	}
	
	public int getNthFibonacciNumberUsingRecursiveMethod(int first,int second,int n)
   {
	    if(n==2)
	    	return second;
	    else
	    	n--;
	    	return getNthFibonacciNumberUsingRecursiveMethod(second,first+second,n);
   }
	
}
