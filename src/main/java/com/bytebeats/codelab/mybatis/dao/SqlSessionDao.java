package com.bytebeats.codelab.mybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;
import java.util.Map;

/**
 * 在一般的 MyBatis-Spring 用法中, 你不需要直接使用SqlSessionFactoryBean或和其对应的SqlSessionFactory。
 * 相反,session 工厂将会被注入到 MapperFactoryBean 或其它扩展了SqlSessionDaoSupport的DAO中。
 *
 * @author Ricky Fung
 * @create 2016-08-29 20:56
 */
public class SqlSessionDao extends SqlSessionDaoSupport {

    public <T> T selectOne(String sql){
        return getSqlSession().selectOne(sql);
    }
    public <T> T selectOne(String sql, Object param){
        return getSqlSession().selectOne(sql, param);
    }

    public <E> List<E> selectList(String sql){
        return getSqlSession().selectList(sql);
    }
    public <E> List<E> selectList(String sql, Object param){
        return getSqlSession().selectList(sql, param);
    }

    public <K, V> Map<K, V> selectMap(String sql, String mapKey){
        return getSqlSession().selectMap(sql, mapKey);
    }
    public <K, V> Map<K, V> selectMap(String sql, Object param, String mapKey){
        return getSqlSession().selectMap(sql, param, mapKey);
    }

    public int insert(String sql){
        return getSqlSession().insert(sql);
    }
    public int insert(String sql, Object param){
        return getSqlSession().insert(sql, param);
    }

    public int update(String sql){
        return getSqlSession().update(sql);
    }
    public int update(String sql, Object param){
        return getSqlSession().update(sql, param);
    }

    public int delete(String sql){
        return getSqlSession().delete(sql);
    }
    public int delete(String sql, Object param){
        return getSqlSession().delete(sql, param);
    }
}
