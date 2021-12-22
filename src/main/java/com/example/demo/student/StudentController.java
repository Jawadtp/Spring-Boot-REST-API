package com.example.demo.student;

import java.util.List;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")

public class StudentController 
{

	private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
	}
	
    @GetMapping
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	//	return List.of(new Student(1L, "Mohammed Jawad TP", "jawadtpmohd@gmail.com", LocalDate.of(2000, Month.APRIL, 10), 21));
	}

    
}
