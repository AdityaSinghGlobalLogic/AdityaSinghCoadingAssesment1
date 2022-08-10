
package com.college.modal;

public class Student {

 private int rollno;

 private String stdName;

 private String standarad;
 
 private String dob;
 
  private double fee;
  
  
  
  
public Student(int rollno, String stdName, String standarad, String dob, double fee) {
	super();
	this.rollno = rollno;
	this.stdName = stdName;
	this.standarad = standarad;
	this.dob = dob;
	this.fee = fee;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public String getStandarad() {
	return standarad;
}
public void setStandarad(String standarad) {
	this.standarad = standarad;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}



 }