package com.jsp.controller;

import com.jsp.dto.StudentP;
import com.jsp.service.StudentService;


public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentService studentService=new StudentService();
StudentP studentP=new StudentP();
studentP.setName("vishawa");
studentP.setEmail("vishawa@222");
studentP.setAdharno(234663444);

StudentP studentP2=studentService.saveStudentP(studentP);
if(studentP2!=null) {
	System.out.println("Student save");
}
	}

}
