package com.linjian.serviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeignExampleService
 *
 * @author jlin
 * @date 2019/3/20 10:40
 * @Description
 */
@FeignClient(value = "service-producer")
public interface FeignExampleService {

	@GetMapping("hello")
	public String hello(@RequestParam(value = "name") String name);
}
