package com.jsp.controller;

import java.util.List;

import com.jsp.dto.StudentP;
import com.jsp.service.StudentService;


public class GetAllDetailsStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentService studentService=new StudentService();
		List<StudentP> studentPs=studentService.getAllTStudentP();
		for(StudentP s:studentPs) {
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getAdharno());
			System.out.println("****************************");
		}
	}

}
