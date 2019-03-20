package com.linjian.serviceconsumer.controller;

import com.linjian.serviceconsumer.service.impl.RibbonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerController
 *
 * @author jlin
 * @date 2019/3/19 22:22
 * @Description
 */
@RestController
public class ConsumerController {
	@Autowired
	RibbonServiceImpl ribbonServiceImpl;

	@GetMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return ribbonServiceImpl.hello(name);
	}

}
