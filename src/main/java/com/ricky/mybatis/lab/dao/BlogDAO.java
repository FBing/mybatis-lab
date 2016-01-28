package com.ricky.mybatis.lab.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.ricky.mybatis.lab.model.Blog;
import com.ricky.mybatis.lab.session.SQLSessionManager;

public class BlogDAO {

	public List<Blog> queryAll(){
		
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
			List<Blog> blog_list = session.selectList("com.ricky.mybatis.lab.BlogMapper.selectAllBlog");
			return blog_list;
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public Blog query(int id){
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
			Blog blog = (Blog) session.selectOne("com.ricky.mybatis.lab.BlogMapper.selectBlog", id);
			return blog;
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public int insert(Blog blog){
		
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
			int result = session.insert("com.ricky.mybatis.lab.BlogMapper.insertBlog", blog);
			session.commit();
			return result;
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
	public int update(Blog blog){
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
			int result = session.update("com.ricky.mybatis.lab.BlogMapper.updateBlog", blog);
			session.commit();	//更新后需要commit
			return result;
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}

	public int delete(){
		SqlSession session = null;
		try {
			session = SQLSessionManager.getSqlSessionFactory().openSession();
			session.commit();
			int result = session.delete("com.ricky.mybatis.lab.BlogMapper.deleteBlog", 1);
			return result;
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
}
