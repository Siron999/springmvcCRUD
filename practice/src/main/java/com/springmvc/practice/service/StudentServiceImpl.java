package com.springmvc.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.practice.entity.Student;
import com.springmvc.practice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student update(Student student) {
		Student existingStudent = studentRepository.findById(student.getId());
		existingStudent.setName(student.getName());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setSemester(student.getSemester());
		studentRepository.update(existingStudent);
		return existingStudent;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		studentRepository.delete(id);
	}

	@Override
	public Student getStudent(Long id) {
		return studentRepository.findById(id);
	}

}
