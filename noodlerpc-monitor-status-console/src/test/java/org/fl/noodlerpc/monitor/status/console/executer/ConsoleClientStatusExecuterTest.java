package org.fl.noodlerpc.monitor.status.console.executer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import org.fl.noodlerpc.monitor.status.console.executer.ConsoleClientStatusExecuter;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/monitor/status/console/executer/noodlerpc-monitor-status-executer-console-client.xml"
})
public class ConsoleClientStatusExecuterTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	ConsoleClientStatusExecuter consoleClientStatusExecuter;
	
	@Test
	public void testExecute() throws Exception {
		consoleClientStatusExecuter.execute();
	}
}
