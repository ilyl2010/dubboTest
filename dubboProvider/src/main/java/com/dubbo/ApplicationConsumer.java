package com.dubbo;

import com.dubbo.service.ConsumerThd;

public class ApplicationConsumer {
	public static void main(String[] args) {
		ConsumerThd thd=new ConsumerThd();
		thd.sayHello();
	}

}
