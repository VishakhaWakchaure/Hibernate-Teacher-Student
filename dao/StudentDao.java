package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentP;



public class StudentDao {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	//Insert value
	public StudentP saveStudentP(StudentP studentP) {
		entityTransaction.begin();
		entityManager.persist(studentP);
		entityTransaction.commit();
		return studentP;
		
	}
//getById
	public StudentP getStudentPById(int id) {
		return entityManager.find(StudentP.class, id);
	}
	
	//getAll Details

	public List<StudentP> getAllStudentP(){
		String jpql="SELECT p FROM StudentP p";
		Query query=entityManager.createQuery(jpql);
		List<StudentP> studentPs=query.getResultList();
		return studentPs;
		
	}
	//deleted 
	public boolean deleteStudentPById(int id) {
		StudentP studentP=entityManager.find(StudentP.class,id);
			entityTransaction.begin();
			entityManager.remove(studentP);
			entityTransaction.commit();
			return true;
		
	}
	//upadate
	public StudentP updateStudentPName(int id,StudentP studentP) {
		if(studentP!=null) {
			entityTransaction.begin();
			entityManager.merge(studentP);
			entityTransaction.commit();
			return studentP;
		}else {
			return null;
		}
	}
}
