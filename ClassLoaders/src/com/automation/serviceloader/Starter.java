package com.automation.serviceloader;

import com.automation.serviceloader.interfaces.Hello;

public class Starter {

	public static void main(String[] args) throws Exception {
		Hello hello1 = Hello.getInstance("ONE");
		hello1.sayHello();
		Hello hello2 = Hello.getInstance("TWO");
		hello2.sayHello();
	}
}
