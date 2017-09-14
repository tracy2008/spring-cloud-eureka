package com.tracy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * @LoadBalanced 标志着 RestTemplate 是通过 Ribbon 客户端负载均衡去调用服务提供者集群的。
	 * 即可以在获取的服务提供者实例列表中，通过 Ribbon 进行选择某实例，然后调用该服务实例。
	 * @return
	 *//*
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}*/
}
