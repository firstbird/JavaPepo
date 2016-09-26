package com.testSSH.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建了一个由spring.xml定义的上下文，xml中的资源（对象）就会自动创建
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.cfg.xml");
		TestService ts = (TestService)ac.getBean("testService");
		System.out.println(ts.getTestName());
	}

}
