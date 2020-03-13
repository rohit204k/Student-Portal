package com.info204k.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
<<<<<<< HEAD

=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
@SpringBootApplication
public class StudentTestPortalApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentTestPortalApplication.class, args);
		System.out.println("Running");
	}
<<<<<<< HEAD

=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	  @Bean
	   public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurer() {
	         @Override
	         public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
	         }
	      };
	   }
<<<<<<< HEAD
}
=======
}
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
