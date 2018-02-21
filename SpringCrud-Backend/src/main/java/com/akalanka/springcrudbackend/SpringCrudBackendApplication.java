package com.akalanka.springcrudbackend;

import com.akalanka.springcrudbackend.model.User;
import com.akalanka.springcrudbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudBackendApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudBackendApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepository.save(new User("Akalanka","Gamage"));
		userRepository.save(new User("Puudu","Bandar"));
		userRepository.save(new User("Pulasthi","Bandra"));

	}
}
