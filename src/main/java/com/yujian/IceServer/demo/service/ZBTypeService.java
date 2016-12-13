package com.yujian.IceServer.demo.service;

import com.rpc.common.internal.framework.annotation.RemoteService;

@RemoteService(value = "zbTypeService")
public interface ZBTypeService {

	String getZBTypeById(Long id);
}
