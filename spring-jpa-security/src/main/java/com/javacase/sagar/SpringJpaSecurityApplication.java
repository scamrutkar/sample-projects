package com.javacase.sagar;

import com.javacase.sagar.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringJpaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaSecurityApplication.class, args);
	}

}
