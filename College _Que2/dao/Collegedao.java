package com.college.dao;
import com.college.modal.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Collegedao {
	
	
	public static Connection getConnection() throws Exception
	{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "root");

		 return con;	
	}
	
	public String register(Student s)

	 {

	 int k=0;

	 try {

	  PreparedStatement ps=getConnection().prepareStatement("insert into STUDENTINFO values (?,?,?,?,?)");


	  ps.setInt(1, s.getRollno());
		ps.setString(2, s.getStdName());
		ps.setString(3, s.getStandarad());
		ps.setString(4, s.getDob());
		ps.setDouble(5, s.getFee());
	  k=ps.executeUpdate();
		System.out.println(k);
		System.out.println("Student added successfully");
	 }
	 
	 catch (Exception e2)
	 {

	  // TODO: handle exception

	 }

	 if(k>0)

	 {

	  return "Successfully Registered";

	 }

	 else

	 {

	  return "Registration failed";

	 }
	 }
	 public void display(int rollno1) throws Exception {
		String query = "select * from STUDENTINFO where rollno=?";
	 PreparedStatement ps=getConnection().prepareStatement(query);
		
		ps.setInt(1,rollno1);
	    ResultSet rs = ps.executeQuery();
		
		 while(rs.next()) {
			 int rollno = rs.getInt("rollno");
			String  name = rs.getString("studentname");
			 String stand = rs.getString("standard");
			  String dob = rs.getString("date_of_birth");
			 Double fee = rs.getDouble("fees");
			 
			 System.out.format("%2s %15s %15s %15s %15s\n",rollno,name,stand,dob,fee);
		 } 
		 System.out.println();
		 System.out.println("Particular Roll No. Details Displayed...");
	
		

	 }
	 public void display() throws Exception {
			String query = "select * from STUDENTINFO ";
		 PreparedStatement ps=getConnection().prepareStatement(query);
			
		
		    ResultSet rs = ps.executeQuery();
			
			 while(rs.next()) {
				 int rollno = rs.getInt("rollno");
				String  name = rs.getString("studentname");
				 String stand = rs.getString("standard");
				  String dob = rs.getString("date_of_birth");
				 Double fee = rs.getDouble("fees");
				 
				 System.out.format("%2s %15s %15s %15s %15s\n",rollno,name,stand,dob,fee);
			 } 
			 System.out.println();
			 System.out.println(" Details Displayed...");
		

}
}
