package com.automation.serviceloader.implementations;

import com.automation.serviceloader.interfaces.Hello;

public class Hello2  implements Hello{

	@Override
	public void sayHello() {
		System.out.println("Hello Two");
	}

	@Override
	public String getName() {
		return "TWO";
	}

}
