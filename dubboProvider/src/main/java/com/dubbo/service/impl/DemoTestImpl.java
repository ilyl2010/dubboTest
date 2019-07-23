package com.dubbo.service.impl;

import com.dubbo.service.DemoTest;

public class DemoTestImpl implements DemoTest {

	public String hello(String name) {
		return "hello "+ name;
	}

}
