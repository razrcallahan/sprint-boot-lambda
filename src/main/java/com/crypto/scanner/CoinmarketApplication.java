package com.crypto.scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoinmarketApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CoinmarketApplication.class, args);
	}
	
	@RequestMapping("/market")
	public String market(@RequestParam(value="name") String name) {
		return "Hi " + name;
	}
}
