package org.fl.noodlerpc.demo.client.press;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.fl.noodlerpc.core.connect.net.TestNetService;
import org.fl.noodlerpc.core.connect.net.TestObject;

public class ServiceProxyFactoryDemoPress {
	
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(
						"classpath:org/fl/noodlerpc/demo/server/press/noodlerpc-demo-press-client-proxyfactory.xml");
		
		TestNetService testNetService = (TestNetService) applicationContext.getBean("testNetServiceProxy");
		
		testNetService.sendObject(TestObject.getInstence());

		applicationContext.destroy();
    }
}
