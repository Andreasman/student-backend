package de.staecker.studentbackend.generator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import de.staecker.studentbackend.model.Student;
import de.staecker.studentbackend.repository.StudentJpaRepository;

@Component
public class StudentFactory {

	@Autowired
	private StudentJpaRepository repo;
	
	private Faker faker = new Faker();
	


	public void saveStudents(int count) {
		
		for (int i = 0; i <count; i++) {
			repo.save(new Student(faker.address().firstName(), faker.address().lastName()));
		}
		
		
	}
}
