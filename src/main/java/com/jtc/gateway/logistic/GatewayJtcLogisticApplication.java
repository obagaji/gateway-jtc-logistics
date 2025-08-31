package com.jtc.gateway.logistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class GatewayJtcLogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayJtcLogisticApplication.class, args);
	}

}
