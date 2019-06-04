package com.example.micro05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
  public String home() {
      return "Hello Docker World";
  }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
