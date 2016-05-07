package org.fl.noodlerpc.core.server.net.export;

import org.fl.noodlerpc.core.connect.net.constent.NetConnectSerializeType;
import org.fl.noodlerpc.core.connect.net.constent.NetConnectServerType;

public class ServiceExporterServletHessian extends ServiceExporter {

	public ServiceExporterServletHessian() {
		this.localPort = 7270;		
		this.serverType = NetConnectServerType.SERVLET;
		this.serializeType = NetConnectSerializeType.HESSIAN;
	}
}
