package com.automation.serviceloader.interfaces;

import java.util.ServiceLoader;

public interface Hello {
	void sayHello();
	String getName();
	
	static Hello getInstance(String name) throws Exception {
		var services = ServiceLoader.load(Hello.class);
		for(var hello: services) {
			if(hello.getName().equals(name)) {
				return hello;
			}
		}
		throw new Exception("No such implementation " + name);
	}
}
