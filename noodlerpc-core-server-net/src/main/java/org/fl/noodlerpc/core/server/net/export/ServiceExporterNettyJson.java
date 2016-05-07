package org.fl.noodlerpc.core.server.net.export;

import org.fl.noodlerpc.core.connect.net.constent.NetConnectSerializeType;
import org.fl.noodlerpc.core.connect.net.constent.NetConnectServerType;

public class ServiceExporterNettyJson extends ServiceExporter {

	public ServiceExporterNettyJson() {
		this.localPort = 7370;		
		this.serverType = NetConnectServerType.NETTY;
		this.serializeType = NetConnectSerializeType.JSON;
	}
}
