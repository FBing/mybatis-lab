package com.ricky.mybatis.lab.session;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionManager {
	
	private volatile static SQLSessionManager sessionManager;
	
	private SqlSessionFactory sqlSessionFactory;
	
	private SQLSessionManager(){
		try {
			init();
		} catch (IOException e) {
			throw new RuntimeException("mybatis init error", e);
		}
	}
	
	public static SQLSessionManager getManager(){
		if(sessionManager==null){
			synchronized (SQLSessionManager.class) {
				if(sessionManager==null){
					sessionManager = new SQLSessionManager();
				}
			}
		}
		return sessionManager;
	}
	
	public SqlSession getSqlSession(){
		
		return sqlSessionFactory.openSession();
	}
	
	private void init() throws IOException{
		
		System.out.println("init");
		
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
}
