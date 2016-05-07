package org.fl.noodlerpc.core.connect.net.hessian.client;

import org.junit.Test;
import org.fl.noodle.common.connect.agent.ConnectAgent;
import org.fl.noodlerpc.core.connect.net.rpc.Invocation;
import org.fl.noodlerpc.core.connect.net.rpc.Invoker;

public class HessianNetConnectAgentTest {

	@Test
	public void testInvokeInvocation() {
		
		HessianNetConnectAgentFactory hessianNetConnectAgentFactory = new HessianNetConnectAgentFactory();
		
		ConnectAgent connectAgent = hessianNetConnectAgentFactory.createConnectAgent(1L, "127.0.0.1", 7170, "/noodlerpc/hessian/TestNetService", 1000, 1000);
		try {
			connectAgent.connect();
			Invocation invocation = new Invocation();
			invocation.setServiceInterface(ConnectAgent.class);
			invocation.setMethodName("isHealthyConnect");
			//invocation.setArguments(arguments);
			((Invoker)connectAgent.getProxy()).invoke(invocation);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
