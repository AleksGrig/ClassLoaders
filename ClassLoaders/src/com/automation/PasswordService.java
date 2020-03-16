package com.automation;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class PasswordService {

	public static void main(String[] args) throws Exception {
		ClassLoader system = ClassLoader.getSystemClassLoader(); // Application/System ClassLoader
		ClassLoader extention = system.getParent(); // Extention ClassLoader
		System.out.println(extention);
		System.out.println(system);

		// myreflection.jar depends upon mypractice.jar
		// load mypractice.jar
		URLClassLoader practiceLoader = new URLClassLoader(
				new URL[] { new URL("file:///C:\\Users\\admin\\git\\JavaPractice\\DheeruJava\\mypractice.jar") },
				system);

		// and then load myreflection.jar
		// pass practiceLoader as parent
		URLClassLoader reflectionLoader = new URLClassLoader(
				new URL[] { new URL("file:///C:/Users/admin/git/Reflection/Reflection/myreflection.jar") },
				practiceLoader);

		Class<?> clazz = Class.forName("com.generator.SuperPassword", true, reflectionLoader);
		Method method = clazz.getDeclaredMethod("createPassword");
		Object obj = clazz.getDeclaredConstructor().newInstance();
		System.out.println(method.invoke(obj));
	}
}
