package org.fl.noodlerpc.core.connect.net.rpc;

public interface Invoker {
	
    Result invoke(Invocation invocation) throws Throwable;
}
