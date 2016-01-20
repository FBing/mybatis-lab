package com.ricky.mybatis.lab;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ricky.mybatis.lab.model.Blog;
import com.ricky.mybatis.lab.session.SQLSessionManager;

/**
 * Hello world!
 *
 */
public class App {
	
	private Logger mLogger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		new App().test();
	}
	
	private void test() {
		
		mLogger.info("test start");
		
		insert();
		select();
		update();
		delete();
		
		mLogger.info("test over");
	}

	public void insert(){
		
		Blog blog = new Blog();
		blog.setTitle("Test");
		blog.setContent("吃饭啦");
		blog.setSectionId(1);
		blog.setUid(1);
		blog.setPublishTime("2016-01-20 13:59");
		
		SQLSessionManager sqlSessionManager = SQLSessionManager.getManager();
		SqlSession session = null;
		try {
			session = sqlSessionManager.getSqlSession();
			int result = session.insert("com.ricky.mybatis.lab.BlogMapper.insertBlog", blog);
			System.out.println("insert result:"+result);
			session.commit();
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public void update(){
		
		Blog blog = new Blog();
		blog.setId(1);
		blog.setTitle("Test");
		blog.setContent("Eating Eating!!!");
		blog.setSectionId(1);
		blog.setUid(1);
		blog.setUpdateTime("2016-01-20 14:26:59");
		
		SQLSessionManager sqlSessionManager = SQLSessionManager.getManager();
		SqlSession session = null;
		try {
			session = sqlSessionManager.getSqlSession();
			int result = session.update("com.ricky.mybatis.lab.BlogMapper.updateBlog", blog);
			session.commit();	//更新后需要commit
			System.out.println("update result:"+result);
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public void delete(){
		SQLSessionManager sqlSessionManager = SQLSessionManager.getManager();
		SqlSession session = null;
		try {
			session = sqlSessionManager.getSqlSession();
			session.commit();
			int result = session.delete("com.ricky.mybatis.lab.BlogMapper.deleteBlog", 1);
			System.out.println("delete result:"+result);
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public void select(){
		SQLSessionManager sqlSessionManager = SQLSessionManager.getManager();
		SqlSession session = null;
		try {
			session = sqlSessionManager.getSqlSession();
			Blog blog = (Blog) session.selectOne("com.ricky.mybatis.lab.BlogMapper.selectBlog", 1);
			System.out.println(blog);
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
}
