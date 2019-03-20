package com.linjian.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @param:
 * @return:
 * @author: jlin
 * @date: 2019-03-20 15:16
 */
//开启配置服务器
@EnableConfigServer
//激活注册发现
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
