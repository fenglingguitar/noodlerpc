package org.fl.noodlerpc.core.server.net.export;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlerpc/core/server/net/export/noodlerpc-core-server-net-exporter-jetty-json.xml"
})
public class ServiceExporterJettyJsonTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void testStart() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
	}
}
