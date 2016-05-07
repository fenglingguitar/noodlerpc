package org.fl.noodlerpc.core.connect.net.register;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import org.fl.noodlerpc.core.connect.net.TestNetService;
import org.fl.noodlerpc.core.connect.net.register.NetClientModuleRegister;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/core/connect/net/register/noodlerpc-core-client-net-register.xml"
})
public class NetClientModuleRegisterTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	NetClientModuleRegister netClientModuleRegister;
	
	@Test
	public void testRegister() throws Throwable {
		netClientModuleRegister.register("127.0.0.1", TestNetService.class.getSimpleName() + "-Client", TestNetService.class.getSimpleName(), "DefaultGroup");
		assertNotNull(netClientModuleRegister.getModuleId(TestNetService.class.getSimpleName()));
	}

	@Test
	public void testCancel() throws Throwable {
		testRegister();
		netClientModuleRegister.cancel();
	}
}
