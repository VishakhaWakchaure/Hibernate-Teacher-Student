package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentP;




public class StudentService {
StudentDao studentDao=new StudentDao();
public StudentP saveStudentP(StudentP studentP) {
	return studentDao.saveStudentP(studentP);
}

//get id
	public StudentP getStudentPById(int id) {
		if(id>0) {
			return studentDao.getStudentPById(id);
		}else {
			return null;
		}
	}
	
	//getAllDetails
		public List<StudentP> getAllTStudentP(){
			return studentDao.getAllStudentP();
		}
		
		//Delete
		public boolean deleteStudentPById(int id) {
			if(id>0) {
				return studentDao.deleteStudentPById(id);
			}else {
				return false;
			}
		}
		
		//upadate
		public StudentP updateStudentPName(int id,String name) {
			StudentP studentP2=studentDao.getStudentPById(id);
			studentP2	.setName(name);
			return studentDao.updateStudentPName(id,studentP2 );
		}
		
}