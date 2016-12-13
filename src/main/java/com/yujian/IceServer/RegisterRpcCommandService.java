package com.yujian.IceServer;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.rpc.common.internal.framework.annotation.RemoteService;
import com.rpc.common.internal.framework.factory.RemoteServiceHolder;

@Configuration
public class RegisterRpcCommandService implements ApplicationContextAware,CommandLineRunner{

	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		RegisterRpcCommandService.applicationContext = applicationContext;
	}

	@Override
	public void run(String... args) throws Exception {
		Map<String,Object> services = applicationContext.getBeansWithAnnotation(Service.class);
        if(null != services){
            for(Object service : services.values()){
                Class<?> serviceClass = service.getClass();
                Class<?>[] interfaces = serviceClass.getInterfaces();
                for(Class<?> c : interfaces){
                    if(c.isAnnotationPresent(RemoteService.class)){
                        RemoteService remote = c.getAnnotation(RemoteService.class);
                        RemoteServiceHolder.register(remote.value(), service);
                    }
                }
            }
        }
	}

}
