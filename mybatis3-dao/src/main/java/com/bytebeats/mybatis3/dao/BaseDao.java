package com.bytebeats.mybatis3.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-03-01 22:25
 */
public class BaseDao extends SqlSessionDaoSupport {

    public <T> T selectOne(String statement){
        return this.getSqlSession().selectOne(statement);
    }
    public <T> T selectOne(String statement, Object parameter){
        return this.getSqlSession().selectOne(statement, parameter);
    }

    public <E> List<E> selectList(String statement){
        return this.getSqlSession().selectList(statement);
    }
    public <E> List<E> selectList(String statement, Object parameter){
        return this.getSqlSession().selectList(statement, parameter);
    }

    public int insert(String statement){
        return this.getSqlSession().insert(statement);
    }
    public int insert(String statement, Object parameter){
        return this.getSqlSession().insert(statement, parameter);
    }

    public int update(String statement){
        return this.getSqlSession().update(statement);
    }

    public int update(String statement, Object parameter){
        return this.getSqlSession().update(statement, parameter);
    }

    public int delete(String statement){
        return this.getSqlSession().delete(statement);
    }
    public int delete(String statement, Object parameter){
        return this.getSqlSession().delete(statement, parameter);
    }
}
