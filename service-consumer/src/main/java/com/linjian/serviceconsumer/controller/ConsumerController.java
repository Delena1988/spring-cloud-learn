package com.linjian.serviceconsumer.controller;

import com.linjian.serviceconsumer.service.FeignExampleService;
import com.linjian.serviceconsumer.service.impl.RibbonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * ConsumerController
 *
 * @author jlin
 * @date 2019/3/19 22:22
 * @Description
 */
@RestController
public class ConsumerController {
	@Resource
	private FeignExampleService feignExampleService;

	@Autowired
	RibbonServiceImpl ribbonServiceImpl;

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return ribbonServiceImpl.hello(name);
	}

	@GetMapping("/helloFeign/{name}")
	public String helloFeign(@PathVariable("name") String name) {
		return feignExampleService.hello(name);
	}

}
