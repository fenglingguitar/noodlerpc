package org.fl.noodlerpc.core.connect.net.register;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import org.fl.noodlerpc.console.util.ConsoleConstant;
import org.fl.noodlerpc.core.connect.net.TestNetService;
import org.fl.noodlerpc.core.connect.net.register.NetServerModuleRegister;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/core/connect/net/register/noodlerpc-core-server-net-register.xml"
})
public class NetServerModuleRegisterTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	NetServerModuleRegister netServerModuleRegister;
	
	@Test
	public void testRegister() throws Throwable {
		
		Map<String, String> clusterTypeMap = new HashMap<String, String>();
		Map<String, String> routeTypeMap = new HashMap<String, String>();
		
		clusterTypeMap.put("sayHello", ConsoleConstant.CLUSTER_TYPE_ONCE);
		routeTypeMap.put("sayHello", ConsoleConstant.ROUTE_TYPE_WEIGHT);
		
		netServerModuleRegister.register(
				"127.0.0.1", 
				8001, 
				"/noodlerpc",
				TestNetService.class.getSimpleName() + "-Server",
				ConsoleConstant.SERVER_TYPE_JETTY,
				ConsoleConstant.SERIALIZE_TYPE_JSON,
				TestNetService.class.getSimpleName(), 
				"DefaultGroup",
				ConsoleConstant.CLUSTER_TYPE_FAILOVER,
				ConsoleConstant.ROUTE_TYPE_RANDOM, 
				1, 
				TestNetService.class,
				clusterTypeMap, 
				routeTypeMap,
				true
				);
		assertNotNull(netServerModuleRegister.getModuleId(TestNetService.class.getSimpleName()));
	}

	@Test
	public void testCancel() throws Throwable {
		testRegister();
		netServerModuleRegister.cancel();
	}
}
