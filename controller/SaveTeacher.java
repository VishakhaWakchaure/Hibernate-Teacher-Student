package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class SaveTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeacherService teacherService=new  TeacherService();
Teacher teacher=new Teacher();
teacher.setName("tormal sir");
teacher.setSubject("python");
teacher.setTno(942267589);

Teacher teacher2 =teacherService.saveTeacher(teacher);
if(teacher2!=null) {
	System.out.println("Teacher saved");
}
	}

}

