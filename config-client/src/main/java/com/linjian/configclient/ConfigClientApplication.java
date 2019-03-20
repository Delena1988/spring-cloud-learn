package com.linjian.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @param:
 * @return:
 * @author: jlin
 * @date: 2019-03-20 15:18
 */
//激活注册发现
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
