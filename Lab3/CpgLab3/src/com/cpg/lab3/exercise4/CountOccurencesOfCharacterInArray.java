package com.cpg.lab3.exercise4;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfCharacterInArray 
{
     public void countNoOfCharactersInArray(char arr[])
     {
    	 
         Map<Character,Integer> map=new HashMap<Character,Integer>();
         for(int i=0;i<arr.length;i++)
         {
        	 if(map.containsKey(arr[i]))
        	 {
        		 map.put(arr[i], map.get(arr[i])+1);
        	 }
        	 else
        		 map.put(arr[i],1);
         }
         for (Map.Entry<Character, Integer> val : map.entrySet()) { 
             System.out.println("Element " + val.getKey() + " "
                                + "occurs"
                                + ": -->" + val.getValue() + " times"); 
         } 
         
     }
}
