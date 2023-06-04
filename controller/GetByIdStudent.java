package com.jsp.controller;

import com.jsp.dto.StudentP;
import com.jsp.service.StudentService;


public class GetByIdStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService=new StudentService();
		StudentP student =studentService.getStudentPById(1);
		if(student!=null) {
			System.out.println(student.getName());
			System.out.println(student.getEmail());	
			System.out.println(student.getAdharno());	
			}else {
			System.out.println("incorrect id");
		}
	}

}
