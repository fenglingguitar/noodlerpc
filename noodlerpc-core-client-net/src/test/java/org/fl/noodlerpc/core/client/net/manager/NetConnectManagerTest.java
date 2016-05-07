package org.fl.noodlerpc.core.client.net.manager;

import org.fl.noodle.common.connect.register.ClientModuleRegister;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/core/client/net/manager/noodlerpc-core-client-net-manager.xml"
})
public class NetConnectManagerTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	NetConnectManager netConnectManager;
	
	@Test
	public void testStart() {
		
		ClientModuleRegister clientModuleRegister = new ClientModuleRegister();
		clientModuleRegister.setModuleId("TestNetService", 4L);
		netConnectManager.setClientModuleRegister(clientModuleRegister);
		netConnectManager.runUpdate();
		
		netConnectManager.getConnectNode("TestNetService");
	}
	
	@Test
	public void testDestroy() {
	}
}
