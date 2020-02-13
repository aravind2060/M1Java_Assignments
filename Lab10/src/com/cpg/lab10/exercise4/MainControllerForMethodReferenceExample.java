package com.cpg.lab10.exercise4;

public class MainControllerForMethodReferenceExample {

	public static void main(String[] args)
	{
       
		InstanceCreationInterface ici=MainControllerForMethodReferenceExample::getInstance;
		
	   System.out.println(ici.getInstance());	
	}
	
	public static Apple getInstance()
	{
		return new Apple("Shimla",120);
	}

}

interface InstanceCreationInterface
{
	Apple getInstance();
}
