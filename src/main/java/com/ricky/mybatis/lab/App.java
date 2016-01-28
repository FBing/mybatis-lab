package com.ricky.mybatis.lab;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ricky.mybatis.lab.dao.BlogDAO;
import com.ricky.mybatis.lab.model.Blog;

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
		
		BlogDAO blogDAO = new BlogDAO();
		List<Blog> blog_list = blogDAO.queryAll();
		System.out.println("blog_list size:"+blog_list.size());
		
		mLogger.info("test over");
	}

}
