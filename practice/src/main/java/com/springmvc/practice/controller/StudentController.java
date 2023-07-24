package com.springmvc.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.practice.entity.Student;
import com.springmvc.practice.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("")
	public String home(Model model) {
		List<Student> students = studentService.getAllStudents();
		System.out.println(students);
		model.addAttribute("students", students);
		return "home";
	}

	@RequestMapping("add")
	public String addPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.save(student);
		return "redirect:/student";
	}

	@RequestMapping("edit/{id}")
	public String editPage(@PathVariable Long id, Model model) {
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		return "edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute("student") Student student) {
		studentService.update(student);
		return "redirect:/student";
	}

	@RequestMapping("delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.delete(id);
		return "redirect:/student";
	}

}
