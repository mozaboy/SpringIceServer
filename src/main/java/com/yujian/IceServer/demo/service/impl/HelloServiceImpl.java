package com.yujian.IceServer.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yujian.IceServer.demo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public String testHello() {
		LOGGER.info("DemoController.getDemo ==============");
		return "Hello Word";
	}

}
