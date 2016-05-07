package org.fl.noodlerpc.core.client.net.refer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import org.fl.noodlerpc.core.connect.net.TestNetService;
import org.fl.noodlerpc.core.connect.net.TestObject;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/core/server/net/export/noodlerpc-core-server-net-exporter-servlet-hessian.xml",
		"classpath:org/fl/noodlerpc/core/client/net/refer/noodlerpc-core-client-net-proxyfactory.xml"
})
public class ServiceProxyFactoryServletHessianTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	TestNetService testNetService;
	
	@Test
	public void testSayHello() {
		System.out.println(testNetService.sayHello("Hello"));
	}

	@Test
	public void testSendObject() {
		System.out.println(testNetService.sendObject(TestObject.getInstence()));
	}
}
