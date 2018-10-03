package de.staecker.studentbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.staecker.studentbackend.model.Student;
import de.staecker.studentbackend.repository.StudentJpaRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentJpaRepository studentJpaRepository;
	
	@GetMapping(value="/all")
	public List <Student> findAll(){
		return studentJpaRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Student findById(@PathVariable final Long id ) {
	return studentJpaRepository.findById(id).get();
		
	}
}
