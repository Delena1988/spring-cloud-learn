package com.linjian.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigClientController
 *
 * @author jlin
 * @date 2019/3/20 14:42
 * @Description
 */
@RestController
public class ConfigClientController {
	@Value("${environment}")
	String environment;

	@RequestMapping(value = "/environment")
	public String environment() {
		return environment;
	}
}
