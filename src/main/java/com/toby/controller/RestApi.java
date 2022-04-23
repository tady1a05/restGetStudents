package com.toby.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toby.model.*;

@RestController
@RequestMapping("/api")
public class RestApi {
	@GetMapping("/students")
	public ArrayList<Student> test() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student a = new Student("Toby","Cheung");
		Student b = new Student("Peter","Cheung");
		Student c = new Student("Kitty","Wong");
		
		studentList.add(a);
		studentList.add(b);
		studentList.add(c);
		
		return studentList;
	}
}
