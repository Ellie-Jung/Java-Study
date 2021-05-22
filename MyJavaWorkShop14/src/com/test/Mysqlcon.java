package com.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;  
class Employee {
	private int empNo;
	private String firstName;
	private String gender;
	public Employee(int empNo, String firstName, String gender) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.gender = gender;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
public class Mysqlcon{  
	public static void main(String args[]){  
		List<Employee> employees = new ArrayList<>();
		
;		try{  
			Class.forName("com.mysql.jdbc.Driver");  //jar파일 추가해야함
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/employees","test","1234");  //sql파일의 이름
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT emp_no,first_name,gender FROM employees.employees;"); //내가뽑아쓰고싶은것. 정렬할것 
			while(rs.next())  {
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));;
				}
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
		System.out.println(employees.size());
		for (Employee e : employees) {
			System.out.println(e.getEmpNo()+","+e.getFirstName()+","+e.getGender());
		}
	}  
	
}