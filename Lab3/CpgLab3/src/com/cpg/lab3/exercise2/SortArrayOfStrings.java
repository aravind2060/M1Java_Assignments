package com.cpg.lab3.exercise2;

public class SortArrayOfStrings 
{
   public String[] getSortedArray(String arr[])
   {
	   int SizeOfArrayOriginal=arr.length,SizeOfArrayTemp=arr.length;
	   String temp="";
	   for(int index1=0;index1<SizeOfArrayOriginal;index1++)
	   {
		   for(int index2=index1+1;index2<SizeOfArrayOriginal;index2++)
		   {
			   if(arr[index1].compareTo(arr[index2])>0)
			   {
				   temp=arr[index1];
				   arr[index1]=arr[index2];
				   arr[index2]=temp;
			   }
		   }
	   }
	   if(SizeOfArrayOriginal%2==0)
		   SizeOfArrayOriginal=SizeOfArrayOriginal/2;
	   else
		   SizeOfArrayOriginal=SizeOfArrayOriginal/2+1;
	   
	   for(int index=0;index<SizeOfArrayOriginal;index++)
		   arr[index]=arr[index].toUpperCase();
	   for(int index=SizeOfArrayOriginal;index<SizeOfArrayTemp;index++)
		   arr[index]=arr[index].toLowerCase();
	   return arr;
   }
}
