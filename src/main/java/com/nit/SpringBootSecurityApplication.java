package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nit.validator.ValidatorService;

@SpringBootApplication
@ComponentScan("com.nit")
public class SpringBootSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	@Autowired
	private ValidatorService ValidatorService;
	
	@Override
	public void run(String... args) throws Exception {
		
		ValidatorService.testEncryptionDecryption();
		
	}

}
