package org.fl.noodlerpc.core.connect.net.agent;

import java.util.List;

import org.fl.noodle.common.connect.agent.AbstractConnectAgent;
import org.fl.noodle.common.connect.distinguish.ConnectDistinguish;
import org.fl.noodle.common.connect.serialize.ConnectSerialize;
import org.fl.noodlerpc.core.connect.net.rpc.Invoker;

public abstract class AbstractNetConnectAgent extends AbstractConnectAgent {

	protected ConnectSerialize connectSerialize;
	
	public AbstractNetConnectAgent(long connectId, String ip, int port, String url, String type, int connectTimeout, int readTimeout, String encoding, int invalidLimitNum, ConnectDistinguish connectDistinguish, List<Object> methodInterceptorList) {
		super(connectId, ip, port, url, type, connectTimeout, readTimeout, encoding, invalidLimitNum, connectDistinguish, methodInterceptorList);
	}

	@Override
	protected Class<?> getServiceInterfaces() {
		return Invoker.class;
	}
	
	public void setConnectSerialize(ConnectSerialize connectSerialize) {
		this.connectSerialize = connectSerialize;
	}
}
