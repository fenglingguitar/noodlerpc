package org.fl.noodlerpc.core.server.net.export;

import org.fl.noodlerpc.core.connect.net.constent.NetConnectSerializeType;
import org.fl.noodlerpc.core.connect.net.constent.NetConnectServerType;

public class ServiceExporterJettyJson extends ServiceExporter {

	public ServiceExporterJettyJson() {
		this.localPort = 7170;		
		this.serverType = NetConnectServerType.JETTY;
		this.serializeType = NetConnectSerializeType.JSON;
	}
}
