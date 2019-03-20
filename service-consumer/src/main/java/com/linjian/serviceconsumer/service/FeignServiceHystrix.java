package com.linjian.serviceconsumer.service;

import org.springframework.stereotype.Component;

/**
 * FeignServiceHystrix
 *
 * @author jlin
 * @date 2019/3/20 11:43
 * @Description
 */
@Component
public class FeignServiceHystrix implements FeignExampleService {

	@Override
	public String hello(String name) {
		return "sorry " + name + "，service has fail!";
	}
}
