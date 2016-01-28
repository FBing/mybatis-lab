package com.ricky.mybatis.lab.session;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionManager {
	
	private volatile static SqlSessionFactory sqlSessionFactory;
	
	private SQLSessionManager(){
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		
		if(sqlSessionFactory==null){
			synchronized (SQLSessionManager.class) {
				if(sqlSessionFactory==null){
					sqlSessionFactory = init();
				}
			}
		}
		
		return sqlSessionFactory;
	}
	
	private static SqlSessionFactory init() {
		
		System.out.println("init");
		
		SqlSessionFactory sessionFactory = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sessionFactory;
		} catch (IOException e) {
			throw new RuntimeException("read mybatis-config.xml error", e);
		}
		
	}
}
