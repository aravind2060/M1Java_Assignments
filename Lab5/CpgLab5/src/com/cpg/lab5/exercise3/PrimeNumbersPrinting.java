package com.cpg.lab5.exercise3;

public class PrimeNumbersPrinting {

	void printPrimeNumbers(int n)
    {
   	 
       for(int i=2;i<=n;i++)
       {
       	boolean isPrime=true;
          for(int j=2;j<=(int)Math.sqrt(i);j++)
          {
       	   if(i%j==0 && i!=2)
       		   isPrime=false;
          }
          if(isPrime)
       	   System.out.println(i);
       }
    }
}
