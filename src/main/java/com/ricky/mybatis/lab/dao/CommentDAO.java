package com.ricky.mybatis.lab.dao;

import org.apache.ibatis.session.SqlSession;
import com.ricky.mybatis.lab.session.SQLSessionManager;

public class CommentDAO {

	public void query(){
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
}
