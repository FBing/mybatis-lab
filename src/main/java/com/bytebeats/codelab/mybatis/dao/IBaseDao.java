package com.bytebeats.codelab.mybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 在一般的 MyBatis-Spring 用法中, 你不需要直接使用SqlSessionFactoryBean或和其对应的SqlSessionFactory。
 * 相反,session 工厂将会被注入到 MapperFactoryBean 或其它扩展了SqlSessionDaoSupport的DAO中。
 *
 * @author Ricky Fung
 * @create 2016-08-29 20:56
 */
public class IBaseDao extends SqlSessionDaoSupport {

}
