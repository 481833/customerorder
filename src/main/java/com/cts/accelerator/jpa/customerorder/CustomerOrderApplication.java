package com.cts.accelerator.jpa.customerorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CustomerOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderApplication.class, args);
	}

}
