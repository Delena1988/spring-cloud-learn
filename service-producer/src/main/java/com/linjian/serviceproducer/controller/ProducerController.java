package com.linjian.serviceproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProducerController
 *
 * @author jlin
 * @date 2019/3/19 22:20
 * @Description
 */
@RestController
public class ProducerController {

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return "hello " + name + "，this is new world";
	}
}
