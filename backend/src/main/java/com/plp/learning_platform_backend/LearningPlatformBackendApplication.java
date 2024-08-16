package com.plp.learning_platform_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningPlatformBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningPlatformBackendApplication.class, args);
	}
//	@GetMapping
//		public String apiRoot(){
//		return "yooo ";
//	}
}
