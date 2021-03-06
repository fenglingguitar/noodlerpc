package org.fl.noodlerpc.monitor.status.beat.executer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.fl.noodle.common.connect.register.ClientModuleRegister;
import org.fl.noodle.common.monitor.executer.AbstractExecuter;
import org.fl.noodlerpc.console.remoting.ConsoleRemotingInvoke;

public class BeatClientStatusExecuter extends AbstractExecuter {

	private final static Logger logger = LoggerFactory.getLogger(BeatClientStatusExecuter.class);
	
	private ClientModuleRegister clientModuleRegister;
	
	private ConsoleRemotingInvoke consoleRemotingInvoke;
	
	@Override
	public void execute() throws Exception {
		
		try {
			consoleRemotingInvoke.clientBeat(clientModuleRegister.getModuleIdSet());
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("execute -> consoleRemotingInvoke.clientBeat -> {} -> Exception:{}", clientModuleRegister, e.getMessage());
			}
		}
		
		if (logger.isDebugEnabled()) {			
			logger.debug("execute -> consoleRemotingInvoke.clientBeat -> {}", clientModuleRegister);
		}
	}
	
	public void setClientModuleRegister(ClientModuleRegister clientModuleRegister) {
		this.clientModuleRegister = clientModuleRegister;
	}
	
	public void setConsoleRemotingInvoke(ConsoleRemotingInvoke consoleRemotingInvoke) {
		this.consoleRemotingInvoke = consoleRemotingInvoke;
	}
}
