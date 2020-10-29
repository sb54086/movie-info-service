package com.example.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoGradleApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(MongoGradleApplication.class);


	public static void main1(String[] args) {
		try{
		SpringApplication.run(MongoGradleApplication.class, args);
			LOGGER.info("Application started {}");
		}catch (Exception e){
			LOGGER.error("Application Failed {}");
		}

	}
	public CommandLineRunner commandLineRunner(){
		return (a)->{
			String url="http://localhot:9980/context/gh/90/io";
			System.out.println(url.substring(url.lastIndexOf("context"),url.length()));
		};
	}

	public static void main(String[] args) {
	 new MongoGradleApplication().commandLineRunner();
	}

}
