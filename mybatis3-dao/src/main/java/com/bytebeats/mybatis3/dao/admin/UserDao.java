package com.bytebeats.mybatis3.dao.admin;

import com.bytebeats.mybatis3.domain.admin.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-03-01 22:37
 */
public interface UserDao {

    int insert(User user);

    List<User> getUsers();
}
