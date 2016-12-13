package com.yujian.IceServer.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.yujian.IceServer.demo.dao.ZBTypeDao;
import com.yujian.IceServer.demo.service.ZBTypeService;

@Service
public class ZBTypeServiceImpl implements ZBTypeService{

	@Autowired
	private ZBTypeDao zbTypeDao;
	
	@Override
	public String getZBTypeById(Long id) {
		return JSON.toJSONString(zbTypeDao.getZBTypeById(id));
	}

}
