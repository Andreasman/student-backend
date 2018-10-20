package de.staecker.studentbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.staecker.studentbackend.model.Student;
import de.staecker.studentbackend.repository.StudentJpaRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentJpaRepository studentJpaRepository;
	
	/**
	 * Alle Studenten ausgeben.
	 * @return Student.
	 */
	@GetMapping(value="/")
	public List <Student> findAll(){
		return studentJpaRepository.findAll();
	}
	
	/**
	 * Einene bestimmten Studenten ausgeben.
	 * @param id
	 * @return Student
	 */
	@GetMapping(value="/{id}")
	public Student findById(@PathVariable final Long id ) {
	return studentJpaRepository.findById(id).get();
		
	}
	
	/**
	 * Einene Studenten speichern.
	 * @param student (Student, welcher im Body als JSON übergeben wird)
	 * @return Neuer gespeicherter Student mit ID.
	 */
	@PostMapping(value="/save")
	public Student save(@RequestBody final Student user) {
		return studentJpaRepository.save(user);
	}
	
	/**
	 * Einen Studenten löschen.
	 * @param id ID des zu löschenden Studenten.
	 */
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable final Long id) {
		studentJpaRepository.deleteById(id);
	}
}
