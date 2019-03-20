package com.linjian.serviceconsumer.service.impl;

import com.linjian.serviceconsumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * RibbonServiceImpl
 *
 * @author jlin
 * @date 2019/3/19 22:23
 * @Description
 */
@Service
public class RibbonServiceImpl implements RibbonService {
	@Autowired
	RestTemplate restTemplate;

	/**
	 * say hello
	 *
	 * @param name
	 * @return
	 */
	@Override
	public String hello(String name) {
		return restTemplate.getForObject("http://service-producer/hello?name=" + name, String.class);
	}
}
