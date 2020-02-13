package com.cpg.lab5.exercise1;

public class SwitchCaseForTraffic
{
  public String getResult(int choice)
  {
	
      
      switch(choice)
      {
      case 1:
   	   return "Stop";
      case 2:
   	   return "Ready";
      case 3:
   	   return "Go";
   	  default:
   		return "Please choose valid option";
      }
  }
}
