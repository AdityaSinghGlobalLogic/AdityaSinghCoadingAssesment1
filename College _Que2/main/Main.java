package com.college.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.college.dao.*;
import com.college.modal.*;
import com.college.services.*;
//import com.college.model.Employee;
//import com.college.service.EmployeeService;


public class Main {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner (System.in);
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4) rollno = 0;
			}  while (rollno == 0);
		
		
		
		String studentName = "";
		boolean lc;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lc = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lc = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lc);
		
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<String>(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();

			System.out.print("Enter fees: ");

			Double	fees = sc.nextDouble();
		
		
		
			Student student=new Student(rollno,studentName, standard, dob, fees);
			 StudentServices service=new StudentServices();

			 String res=service.register(student);
			 System.out.println(res);	
			 
			 
			 System.out.println("Enter the rollno of Student FOR DISPLAY THE DATA OR PRESS 0 FOR DISPLAYING ALL  STUDENT DATA : ");
			 int rollnotoDisplay=sc.nextInt();
			 if(rollnotoDisplay>0)
			 service.display(rollnotoDisplay);
			 else 
				 service.display();
			 
	}
		
			
		

	}


