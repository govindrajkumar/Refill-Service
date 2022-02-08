package com.cts.refill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Main class which contains the main function which starts the whole
 * application
 **/

@SpringBootApplication
@EnableFeignClients
public class RefillMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefillMicroServiceApplication.class, args);
	}

}
