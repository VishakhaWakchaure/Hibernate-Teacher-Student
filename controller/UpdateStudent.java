package com.jsp.controller;

import com.jsp.dto.StudentP;

import com.jsp.service.StudentService;


public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
StudentService studentService=new StudentService();
StudentP studentP=studentService.updateStudentPName(5, " sachin");
System.out.println(studentP.getName());
	}

}
