package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetIdTeacher {
public static void main(String[] args) {
	TeacherService teacherService=new TeacherService();
	Teacher teacher =teacherService.getTeacherById(3);
	if(teacher!=null) {
		System.out.println(teacher.getSubject());
		System.out.println(teacher.getName());	
		System.out.println(teacher.getTno());	
		}else {
		System.out.println("incorrect id");
	}
}
}


