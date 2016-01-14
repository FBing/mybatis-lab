package com.ricky.mybatis.lab;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ricky.mybatis.lab.model.Blog;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		SqlSession session = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			session = sqlSessionFactory.openSession();
			Blog blog = (Blog) session.selectOne("com.ricky.mybatis.lab.BlogMapper.selectBlog", 101);
			System.out.println(blog);
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(session!=null){
				session.close();
			}
		}
	}
	
}
