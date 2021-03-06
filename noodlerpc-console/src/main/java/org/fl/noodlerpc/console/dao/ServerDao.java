package org.fl.noodlerpc.console.dao;

import java.util.List;

import org.fl.noodle.common.mvc.vo.PageVo;
import org.fl.noodlerpc.console.vo.ServerVo;

public interface ServerDao {
	
	public PageVo<ServerVo> queryServerPage(ServerVo vo, int page, int rows) throws Exception;

	public List<ServerVo> queryServerList(ServerVo vo) throws Exception;

	public void insertServer(ServerVo vo) throws Exception;

	public void insertsServer(ServerVo[] vos) throws Exception;

	public void updateServer(ServerVo vo) throws Exception;

	public void updatesServer(ServerVo[] vos) throws Exception;

	public void deleteServer(ServerVo vo) throws Exception;

	public void deletesServer(ServerVo[] vos) throws Exception;
	
	public PageVo<ServerVo> queryServerIncludeServicePage(ServerVo vo, int page, int rows) throws Exception;
	
	public PageVo<ServerVo> queryServerExcludeServicePage(ServerVo vo, int page, int rows) throws Exception;
	
	public void insertsServerService(ServerVo[] vos) throws Exception;
	
	public void deletesServerService(ServerVo[] vos) throws Exception;
	
	public PageVo<ServerVo> queryServerIncludeGroupPage(ServerVo vo, int page, int rows) throws Exception;
	
	public PageVo<ServerVo> queryServerExcludeGroupPage(ServerVo vo, int page, int rows) throws Exception;

	public void insertsServerGroup(ServerVo[] vos) throws Exception;
	
	public void deletesServerGroup(ServerVo[] vos) throws Exception;	
	
	public Long updateOrInsertServer(ServerVo vo) throws Exception;
	
	public List<ServerVo> queryServerOnlineList(ServerVo vo) throws Exception;
	
	public List<ServerVo> queryServerOfflineList(ServerVo vo) throws Exception;
}
