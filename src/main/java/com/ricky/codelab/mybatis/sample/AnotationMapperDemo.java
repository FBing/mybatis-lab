package com.ricky.codelab.mybatis.sample;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ricky.codelab.mybatis.sample.mapper.IAuthorDao;

public class AnotationMapperDemo {

	public static void main(String[] args) {
		
		String resource = "mybatis-config.xml";
		
		//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = AnotationMapperDemo.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        
        // 由于使用了注解，所以在主配置文件没有mapper，需要在代码里显示注册该mapper接口
        sessionFactory.getConfiguration().addMapper(IAuthorDao.class);
        
        SqlSession session = sessionFactory.openSession();
        try{
            IAuthorDao authorDao = session.getMapper(IAuthorDao.class);
            System.out.println(authorDao.retrieveAllUsers());
            
        }finally{
            session.close();
        }
	}

}
