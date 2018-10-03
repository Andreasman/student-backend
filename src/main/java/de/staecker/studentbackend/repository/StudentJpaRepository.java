package de.staecker.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import de.staecker.studentbackend.model.Student;

@Component
public interface StudentJpaRepository extends JpaRepository<Student, Long>{

}
