package com.bytebeats.codelab.mybatis.dao.impl;

import com.bytebeats.codelab.mybatis.dao.IBaseDao;
import com.bytebeats.codelab.mybatis.dao.IUserDao;
import com.bytebeats.codelab.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-08-29 20:43
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {

    @Autowired
    private IBaseDao baseDao;

    @Override
    public long insert(User user) {

        return baseDao.getSqlSession().insert("com.bytebeats.codelab.mybatis.mapper.UserMapper.insert", user);
    }

    @Override
    public int insertBatch(List<User> list) {

        return baseDao.getSqlSession().insert("com.bytebeats.codelab.mybatis.mapper.UserMapper.batchInsert", list);
    }

    @Override
    public int update(User user) {

        return baseDao.getSqlSession().update("com.bytebeats.codelab.mybatis.mapper.UserMapper.updateById", user);
    }

    @Override
    public int delete(long id) {

        return baseDao.getSqlSession().delete("com.bytebeats.codelab.mybatis.mapper.UserMapper.deleteById", id);
    }

    @Override
    public User queryById(long id) {

        return baseDao.getSqlSession().selectOne("com.bytebeats.codelab.mybatis.mapper.UserMapper.selectById", id);
    }

    @Override
    public List<User> queryUsers() {

        return baseDao.getSqlSession().selectList("com.bytebeats.codelab.mybatis.mapper.UserMapper.selectList");
    }
}
