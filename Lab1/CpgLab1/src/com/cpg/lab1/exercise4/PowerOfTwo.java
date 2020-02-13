package com.cpg.lab1.exercise4;

public class PowerOfTwo 
{
  public boolean checkNumber(int input)
  {
	  boolean isPowerOfTwo=true;
	    while(input!=1)
	    {
	    	if(input%2==1)
	    	{
	    		isPowerOfTwo=false;
	           break;
	    	 }
	    	input=input/2;
	    }
	  
	  return isPowerOfTwo;
  }
}
