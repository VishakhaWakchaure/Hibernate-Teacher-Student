package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Teacher;


public class TeacherDao {
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

//getAll Details

public List<Teacher> getAllTeacher(){
	String jpql="SELECT p FROM Teacher p";
	Query query=entityManager.createQuery(jpql);
	List<Teacher> teachers=query.getResultList();
	return teachers;
	
}

//update
public Teacher updateTeacherName(int id,Teacher teacher) {
	if(teacher!=null) {
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		return teacher;
	}else {
		return null;
	}
}

//Delete
public boolean deleteTeacherById(int id) {
	Teacher teacher=entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	
}


//get by id

public Teacher getTeacherById(int id) {
	return entityManager.find(Teacher.class, id);
}


//Insert value
public Teacher saveTeacher(Teacher teacher) {
	entityTransaction.begin();
	entityManager.persist(teacher);
	entityTransaction.commit();
	return teacher;
}

}




