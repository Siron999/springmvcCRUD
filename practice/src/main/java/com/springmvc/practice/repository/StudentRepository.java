package com.springmvc.practice.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.practice.entity.Student;

@Component
public class StudentRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void save(Student student) {
		hibernateTemplate.setCheckWriteOperations(false);
		this.hibernateTemplate.save(student);
	}

	@Transactional
	public void update(Student student) {
		hibernateTemplate.setCheckWriteOperations(false);
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.update(student);
		beginTransaction.commit();
	}

	public List<Student> findAll() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	@Transactional
	public void delete(Long id) {
		hibernateTemplate.setCheckWriteOperations(false);
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.delete(session.get(Student.class, id));
		beginTransaction.commit();
	}

	public Student findById(Long id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

}