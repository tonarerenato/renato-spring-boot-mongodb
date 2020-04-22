package com.renato.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.renato.workshopmongo.domain.User;
import com.renato.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;

	@Override
	public void run(String... arg0) throws Exception {

		userReposiroty.deleteAll();

		User maria = new User(null, "Maria Brown2", "maria@gmail.com");
		User alex = new User(null, "Alex Green2", "alex@gmail.com");
		User bob = new User(null, "Bob Grey2", "bob@gmail.com");

		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
	}

}