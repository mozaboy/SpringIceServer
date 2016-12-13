package com.yujian.IceServer.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yujian.IceServer.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class ZBTypeServiceTest {

	@Autowired
	private ZBTypeService zbTypeService;
	
	@Test
	public void getZBTypeByIdTest(){
		System.out.println(zbTypeService.getZBTypeById(16L));
	}
}
