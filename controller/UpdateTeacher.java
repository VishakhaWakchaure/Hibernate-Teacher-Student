package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class UpdateTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeacherService teacherService=new TeacherService();
Teacher teacher=teacherService.updateTeacherName(5, " sachin");
System.out.println(teacher.getName());
	}

}

