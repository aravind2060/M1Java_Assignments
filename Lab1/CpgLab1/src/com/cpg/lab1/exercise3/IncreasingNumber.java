package com.cpg.lab1.exercise3;

public class IncreasingNumber 
{
	 boolean checkIncreasingNumber(int n)
	{
		boolean isTrue=true;
		String len=""+n;
		int arr[]=new int[len.length()];
		int i=0;
		while(n!=0)
		{
		   arr[i++]=n%10;	
			n=n/10;
		}
		for(int j=arr.length-1;j>0;j--)
		{
			if(arr[j]>arr[j-1])
				isTrue=false;
		}
		return isTrue;
	}
}
