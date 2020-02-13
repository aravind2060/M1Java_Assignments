package com.cpg.lab10.exercise2;

import java.util.Scanner;

public class MainControllerForInsertSpaceBetweenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scan.nextLine();
		InsertSpaceBetweenString obj=new InsertSpaceBetweenString();
		System.out.println(obj.getFormattedString(input));
		scan.close();
	}

}
