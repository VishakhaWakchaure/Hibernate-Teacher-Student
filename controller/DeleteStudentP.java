package com.jsp.controller;

import com.jsp.service.StudentService;

public class DeleteStudentP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService=new StudentService();
		 boolean flag=studentService.deleteStudentPById(4);
		 if(flag==true) {
			 System.out.println("student deleted");
		 }else {
			 System.out.println("student not deleted");
		 }
			}
	}


