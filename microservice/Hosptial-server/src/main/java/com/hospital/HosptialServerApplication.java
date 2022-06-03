package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HosptialServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HosptialServerApplication.class, args);
	}

}
