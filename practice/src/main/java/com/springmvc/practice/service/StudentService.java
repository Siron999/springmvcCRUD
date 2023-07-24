package com.springmvc.practice.service;

import java.util.List;

import com.springmvc.practice.entity.Student;

public interface StudentService {
	public void save(Student student);

	public List<Student> getAllStudents();

	public void delete(Long id);

	public Student update(Student student);

	public Student getStudent(Long id);
}
