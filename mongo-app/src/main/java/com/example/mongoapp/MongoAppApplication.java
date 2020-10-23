package com.example.mongoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoAppApplication.class, args);
	}

}
