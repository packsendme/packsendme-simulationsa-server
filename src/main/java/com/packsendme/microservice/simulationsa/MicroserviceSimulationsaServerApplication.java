package com.packsendme.microservice.simulationsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimulationsaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimulationsaServerApplication.class, args);
	}
}

