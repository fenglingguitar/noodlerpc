package org.fl.noodlerpc.core.server.net.export;

import org.fl.noodlerpc.core.connect.net.constent.NetConnectSerializeType;
import org.fl.noodlerpc.core.connect.net.constent.NetConnectServerType;

public class ServiceExporterServletJson extends ServiceExporter {

	public ServiceExporterServletJson() {
		this.localPort = 7270;		
		this.serverType = NetConnectServerType.SERVLET;
		this.serializeType = NetConnectSerializeType.JSON;
	}
}
