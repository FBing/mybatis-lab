package com.bytebeats.codelab.mybatis;

import com.bytebeats.codelab.mybatis.dao.IUserDao;
import com.bytebeats.codelab.mybatis.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * http://www.mybatis.org/mybatis-3/index.html
 * http://www.mybatis.org/spring/zh/
 * http://www.mybatis.org/spring/zh/sqlsession.html
 *
 * @author Ricky Fung
 * @create 2016-08-29 20:28
 */
public class App {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) context.getBean("userDao");
        userDao.insert(new User());

        context.close();
    }
}
