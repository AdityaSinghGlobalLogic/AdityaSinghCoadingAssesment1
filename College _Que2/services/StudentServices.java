package com.college.services;
import com.college.modal.*;
import com.college.dao.*;
public class StudentServices 
{
	public String register(Student student)

	 {

	 Collegedao sdao=new Collegedao();

	 return sdao.register(student);
	 }
	public void display(int roll)

	 {

	 Collegedao sdao=new Collegedao();
          try {
			sdao.display(roll);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public void display() throws Exception

	 {

	 Collegedao sdao=new Collegedao();

	  try {
			sdao.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 }
}
