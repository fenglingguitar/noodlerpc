package org.fl.noodlerpc.demo.client.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.fl.noodlerpc.core.connect.net.TestNetService;

public class ServiceProxyFactoryDemoExampleTwo {
	
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(
						"classpath:org/fl/noodlerpc/demo/server/example/noodlerpc-demo-example-client-proxyfactory-two.xml");
		
		TestNetService testNetService = (TestNetService) applicationContext.getBean("testNetService");
		
		for (int i=0; i<Integer.MAX_VALUE; i++) {		
			try {
				System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + testNetService.sayHello("noodlerpc"));
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		applicationContext.destroy();
    }
}
