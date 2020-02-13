package com.cpg.lab10.exercise6;

import java.util.ArrayList;

public class EmployeeRepository {
        
	     
		public static ArrayList<Employee> populateDataOfEmployees()
		{
		   Department developersDepartment=new Department(101,201,"Developers");
		   Department operationsDepartment=new Department(102,202,"Operations");
		   Department testingDepartment=new Department(103,203,"Testing");
		   
		  ArrayList<Employee> arraylist=new ArrayList<>();
		  
		  
		  arraylist.add(new Employee(301,201,"aravind","reddy","aravind4532@gmail.com","9866772522","Developer",1,"23-05-2020",operationsDepartment));
		  arraylist.add(new Employee(302,202,"Raman","Kumar","rk.903@gmail.com","9866772523","Operations",1,"10-01-2020",operationsDepartment));
		  arraylist.add(new Employee(303,201,"Nandish","Naidana","rockstar@gmail.com","9866772524","Developer",1,"17-05-2020",developersDepartment));
		  arraylist.add(new Employee(304,203,"sai krishna","reddy","saikrishna@gmail.com","9866772525","Testing",1,"23-05-2020",testingDepartment));
		  
		  arraylist.add(new Employee(305,203,"Abhilash","reddy","abhilash@gmail.com","9866772526","Testing",1,"23-05-2020",testingDepartment));
		  arraylist.add(new Employee(306,203,"Shyam","Kumar","rk.903@gmail.com","9866772523","Testing",1,"10-01-2020",testingDepartment));
		  arraylist.add(new Employee(307,202,"Ram","Naidana","rockstar@gmail.com","9866772524","Operations",1,"17-05-2020",operationsDepartment));
		  arraylist.add(new Employee(308,201,"Uday","reddy","saikrishna@gmail.com","9866772525","Developer",1,"23-05-2020",developersDepartment));
		  
		  arraylist.add(new Employee(309,201,"mahesh","reddy","aravind4532@gmail.com","9866772522","Developer",1,"23-05-2020",developersDepartment));
		  arraylist.add(new Employee(310,202,"Rohit","Kumar","rk.903@gmail.com","9866772523","Operations",1,"10-01-2020",operationsDepartment));
		  arraylist.add(new Employee(311,203,"sai","Naidana","rockstar@gmail.com","9866772524","Testing",1,"17-05-2020",testingDepartment));
		  arraylist.add(new Employee(312,202,"sudheer","naik","saikrishna@gmail.com","9866772525","Operations",1,"23-05-2020",operationsDepartment));
		  arraylist.add(new Employee(313,202,"shiva","reddy","shiva@gmail.com","9866772530","Operations",1,"23-06-2020",operationsDepartment));
		  
		  return arraylist;
		}
}
