package com.cpg.lab10.exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.stream.*;

public class EmployeeService {

	public static void main(String args[]) {
	
		System.out.println("\nSum Of Slaray of all employees!");
		
		ArrayList<Employee> list=EmployeeRepository.populateDataOfEmployees();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose one Choice:");
		while(true)
		{
			System.out.print("\n\n\n1)Sum Of AllSalaries Of Employees \t2)Display Employee Record Based on Department"
					+ "\n3)Senior Most Employee Of Organization \t4)List Employee Name and their service period"
					+ "\n5)List Employees Without Department \t 6)List Departments Without Employees"
					+ "\n7)Find Department With highest noof employees \t 8)List Employee Name and there joining date "
					+ "\n9)List Employees Who joined organization on friday \t 10)List Employee Name and Manager Name"
					+ "\n11)List Employee name and salary increased by 15% \t 12)List Employee without Manager"
					+ "\n13)List Employees under a particular manager \t 14)Sort Employee By id"
					+ "\n15)Sort Employee By Department id \t 16)Sort Employee By firstname"
					+ "\n\n 17)To Exit Application\n\nPlease provide input:");
		 int choice=scan.nextInt();
		 switch(choice)
		 {
		 case 1:
			 sumOfAllSalariesOfEmployees1(list);
			 break;
		 case 2:
			  displayEmployeeBasedOnDepartment2(list);
			 break;
		 case 3:
			 seniorMostEmployeeOfOrganization3(list);
			 break;
		 case 4:
			 employeeNameAndServicePeroid4(list);
			 break;
		 case 5:
			 employeeWithoutDepartment5(list);
			 break;
		 case 6:
			 departmentWithoutEmployee6(list);
			 break;
		 case 7:
			 departmentWithHighestNoOfEmployees7(list);
			 break;
		 case 8:
			 employeeNameAndJoiningDate8(list);
			 break;
		 case 9:
			 employeeJoinedOnFriday9(list);
			 break;
		 case 10:
			 departmentsWithoutEmployee10(list);
			 break;
		 case 11:
			 employeeNameAndSalaryIncreasedByFifteenPercent11(list);
			 break;
		 case 12:
			  employeeWithoutManager12(list);
			 break;
		 case 13:
			 System.out.print("\nEnter Manager Name:");
			 String managerName=scan.nextLine();
			 employeeUnderParticularManager13(managerName,list);
			 break;
		 case 14:
			 sortEmployeeById14(list);
			 break;
		 case 15:
			 sortEmployeeByDepartmentId15(list);
			 break;
		 case 16:
			 sortEmployeeByFirstName16(list);
			 break;
		 case 17:
			 return;
			 default:
				 System.out.println("Incorrect Input!!");
		 }
		   
		}

	
	}
	
	private static void sumOfAllSalariesOfEmployees1(ArrayList<Employee> list)
	{
		 Optional<Integer> sum=list.stream().map((p)->p.getSalary()).reduce((a,b)->a+b);  
		  if(sum.isPresent())
		   System.out.println("Sum Of all Salaries: "+sum.get());
	}
	
    private static void displayEmployeeBasedOnDepartment2(ArrayList<Employee> list)
	{
	   System.out.println("Employee based on department:");
	   
	}
	private static void seniorMostEmployeeOfOrganization3(ArrayList<Employee> list) {
		
		
	}
	private static void employeeNameAndServicePeroid4(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}
	
	private static void employeeWithoutDepartment5(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}

	private static void departmentWithoutEmployee6(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}
	private static void departmentWithHighestNoOfEmployees7(ArrayList<Employee> list) {
		
		
	}

	private static void employeeNameAndJoiningDate8(ArrayList<Employee> list) {
		System.out.println("\nEmployee Name and joining date:");
		list.stream().forEach(p->System.out.println(p.getFirstName()+"-->"+p.getHireDate()));
		
	}
	private static void employeeJoinedOnFriday9(ArrayList<Employee> list) {
		
		
	}
	private static void departmentsWithoutEmployee10(ArrayList<Employee> list) {
		
		
	}
	private static void employeeNameAndSalaryIncreasedByFifteenPercent11(ArrayList<Employee> list) {
	
		
	}
	
	private static void employeeWithoutManager12(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}
	private static void employeeUnderParticularManager13(String managerName, ArrayList<Employee> list) {
//		list.stream().filter(p->(p.getDepartment().getManagerName))
		
	}
	private static void sortEmployeeById14(ArrayList<Employee> list) {
		System.out.println("\n\nSorting of employee based on Employee Id:");
		list.stream().sorted((a,b)->(a.getEmployeeId()>b.getEmployeeId())?1:-1).forEach(System.out::println);
		
	}
	private static void sortEmployeeByDepartmentId15(ArrayList<Employee> list) {
		
		System.out.println("\n\nSorting of employee based on DepartMent Id:");
	
		list.stream().sorted((a,b)->(a.getDepartment().getDepartmentId()>b.getDepartment().getDepartmentId())?1:-1).forEach(System.out::println);
	}

	private static void sortEmployeeByFirstName16(ArrayList<Employee> list) {
	 
	   System.out.println("\n\nSorting Employee by first name:\n");	
		list.stream().sorted((a,b)->a.getFirstName().compareToIgnoreCase(b.getFirstName())).forEach(System.out::println);
		System.out.println("\n\n");
	}



	


	



	



	



	



	





	





	






	



	



	
	
	

}

