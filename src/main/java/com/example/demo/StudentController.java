package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
//	private Student student = new Student("uzair",1);
	@GetMapping("/students")
	public List<Student> getStudents() {
        List<Student> students=new ArrayList<>();
        students.add(new Student("uzair ali",10));
        students.add(new Student(" ali",3));
        return students;
    }
	
	@GetMapping("/student")
	public Student getStudent()
	{
		Student student=new Student("javed",2);
		return student;
	}
	@GetMapping("{name}/{id}")
	public Student studentPath(@PathVariable("name") String name,@PathVariable("id") int id)
	{
		return new Student(name,id);
	}
}
