package de.staecker.studentbackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.staecker.studentbackend.bootstrap.DatabaseBootstrap;

@Configuration
public class DevConfig {

	@Bean
	public DatabaseBootstrap databaseBootstrap() {
		return new DatabaseBootstrap();
	}
}
