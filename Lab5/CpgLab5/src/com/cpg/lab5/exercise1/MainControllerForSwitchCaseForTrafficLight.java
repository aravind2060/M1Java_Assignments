package com.cpg.lab5.exercise1;
import java.util.*;
public class MainControllerForSwitchCaseForTrafficLight {

	public static void main(String[] args) {
		
		try(Scanner scan=new Scanner(System.in))
		{
		  SwitchCaseForTraffic obj=new SwitchCaseForTraffic();	
		   scan.nextLine();
			while(true)
			{
			 System.out.println("\n\n1)Red\n2)Yellow\n3)Green");
			 System.out.println(obj.getResult(scan.nextInt()));
			}
		}

	}

}
