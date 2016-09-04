package com.bytebeats.codelab.mybatis.dao.impl;

import com.bytebeats.codelab.mybatis.dao.SqlSessionDao;
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
    private SqlSessionDao sqlSessionDao;

    @Override
    public long insert(User user) {

        return sqlSessionDao.insert("com.bytebeats.codelab.mybatis.mapper.UserMapper.insert", user);
    }

    @Override
    public int insertBatch(List<User> list) {

        return sqlSessionDao.insert("com.bytebeats.codelab.mybatis.mapper.UserMapper.batchInsert", list);
    }

    @Override
    public int update(User user) {

        return sqlSessionDao.update("com.bytebeats.codelab.mybatis.mapper.UserMapper.updateById", user);
    }

    @Override
    public int delete(long id) {

        return sqlSessionDao.delete("com.bytebeats.codelab.mybatis.mapper.UserMapper.deleteById", id);
    }

    @Override
    public User queryById(long id) {

        return sqlSessionDao.selectOne("com.bytebeats.codelab.mybatis.mapper.UserMapper.selectById", id);
    }

    @Override
    public List<User> queryUsers() {

        return sqlSessionDao.selectList("com.bytebeats.codelab.mybatis.mapper.UserMapper.selectList");
    }
}
