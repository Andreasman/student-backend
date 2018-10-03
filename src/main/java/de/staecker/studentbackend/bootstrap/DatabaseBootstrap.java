package de.staecker.studentbackend.bootstrap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import de.staecker.studentbackend.generator.StudentFactory;

public class DatabaseBootstrap implements InitializingBean{
	
    @Autowired
	StudentFactory studentFactory;
    

	
	@Override
	public void afterPropertiesSet() throws Exception {
		studentFactory.saveStudents(10);
		
	}

}
