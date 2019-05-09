package com.tedul.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tedu.pojo.User;

public class TestSpring {
	@Test
	public void testSpring() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
