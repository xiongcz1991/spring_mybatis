package com.xiongcz.hello2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiongcz.pojo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/")
	public String default_page(Model model) {
		model.addAttribute("student",new Student());
		return "detail";
	}
	
	@RequestMapping("/add")
	public String addStudent(Student student,
			HttpServletRequest request) {
		getStudents(request).add(student);
		return "redirect:/student/"+student.getId();
	}
	
	@RequestMapping("/del/{id}")
	public String delStudent(HttpServletRequest request,
			@PathVariable int id) {
		List<Student> students = getStudents(request);
		for (Student student : students) {
			if(student.getId()==id) {
				students.remove(student);
			}
		}
		return "redirect:list";
	}
	
	@RequestMapping("/mod")
	public String modStudent(HttpServletRequest request,
			Student s) {
		List<Student> students = getStudents(request);
		for (Student student : students) {
			if(student.getId()==s.getId()) {
				students.remove(student);
				students.add(s);
			}
		}
		return "redirect:list";
	}
	
	@RequestMapping("/{id}")
	public String getStudent(HttpServletRequest request,
			@PathVariable int id,Model model) {
		List<Student> students = getStudents(request);
		for (Student student : students) {
			System.out.println(student);
			if(student.getId()==id) {
				model.addAttribute("student", student);
			}
		}
		return "detail";
	}
	
	public List<Student> getStudents(HttpServletRequest request){
		ServletContext servletContext= request.getServletContext();
		@SuppressWarnings("unchecked")
		List<Student> students = (List<Student>) servletContext.getAttribute("students");
		if(students==null) {
			students=new ArrayList<>();
			servletContext.setAttribute("students", students);
		}
		return students;
	}
}
