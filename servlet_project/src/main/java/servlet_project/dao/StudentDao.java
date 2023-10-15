package servlet_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_project.dto.StudentDto;

public class StudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insert(StudentDto dto){
		et.begin();
		em.persist(dto);
		et.commit();
//		return "Data Inserted Successfully";
	}
	public Object fetch(int id){
		StudentDto dto=em.find(StudentDto.class, id);
		return dto;	
	}
	public String update(int id,long number){
		StudentDto dto=em.find(StudentDto.class, id);
		dto.setNumber(number);
		et.begin();
		em.merge(dto);
		et.commit();
		return "Data Updated Successfully";
	}
	public String delete(int id){
		StudentDto dto=em.find(StudentDto.class, id);
		et.begin();
		em.remove(dto);
		et.commit();
		return "Data Deleted Successfully";
	}
	public List<StudentDto> fetchAll(){
		Query q=em.createQuery("select a from student a");
		List<StudentDto> l=q.getResultList();
		return l;
	}
	public String updateall(StudentDto dto){
		et.begin();
		em.merge(dto);
		et.commit();
		return "Values Updated";
	}

}
