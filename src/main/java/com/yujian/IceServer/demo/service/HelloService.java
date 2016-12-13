package com.yujian.IceServer.demo.service;

import com.rpc.common.internal.framework.annotation.RemoteService;

@RemoteService(value = "helloService")
public interface HelloService {

	String testHello();
}
