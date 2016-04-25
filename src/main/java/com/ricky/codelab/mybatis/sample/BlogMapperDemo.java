package com.ricky.codelab.mybatis.sample;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ricky.codelab.mybatis.sample.mapper.BlogMapper;
import com.ricky.codelab.mybatis.sample.model.Blog;

public class BlogMapperDemo {

	public static void main(String[] args) {
		
		String resource = "mybatis-config.xml";
		
		//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = BlogMapperDemo.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = sessionFactory.openSession();
        try{
        	BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        	Blog blog = blogMapper.selectBlogById(1);
            System.out.println(blog);
        }finally{
            session.close();
        }
	}

}
