package com.automation.serviceloader.implementations;

import com.automation.serviceloader.interfaces.Hello;

public class Hello1 implements Hello{

	@Override
	public void sayHello() {
		System.out.println("Hello One");
	}

	@Override
	public String getName() {
		return "ONE";
	}

}
