package com.jsp.service;
import java.util.List;

import com.jsp.dao.TeacherDao;

import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao t1=new TeacherDao();
	//save
	public Teacher saveTeacher(Teacher teacher) {
		return t1.saveTeacher(teacher);
	}
	
	
	//get id
	public Teacher getTeacherById(int id) {
		if(id>0) {
			return t1.getTeacherById(id);
		}else {
			return null;
		}
	}
	//getAllDetails
	public List<Teacher> getAllTeacher(){
		return t1.getAllTeacher();
	}
	
	//Delete
	public boolean deleteTeacherById(int id) {
		if(id>0) {
			return t1.deleteTeacherById(id);
		}else {
			return false;
		}
	}
	
	//upadate
	public Teacher updateTeacherName(int id,String name) {
		Teacher teacher2=t1.getTeacherById(id);
		teacher2.setName(name);
		return t1.updateTeacherName(id, teacher2);
	}
	
	
}


