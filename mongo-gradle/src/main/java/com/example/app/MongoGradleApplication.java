package com.example.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoGradleApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(MongoGradleApplication.class);


	public static void main(String[] args) {
		try{
		SpringApplication.run(MongoGradleApplication.class, args);
			LOGGER.info("Application started {}");
		}catch (Exception e){
			LOGGER.error("Application Failed {}");
		}

	}

}
