package com.jsp.controller;

import com.jsp.service.TeacherService;

public class DeleteTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeacherService teacherService=new TeacherService();
 boolean flag=teacherService.deleteTeacherById(4);
 if(flag==true) {
	 System.out.println("teacher deleted");
 }else {
	 System.out.println("teacher not deleted");
 }
	}

}

