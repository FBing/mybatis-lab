package com.bytebeats.codelab.mybatis.dao;

import com.bytebeats.codelab.mybatis.model.User;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-08-29 20:41
 */
public interface IUserDao {

    long insert(User user);

    int update(User user);

    User queryById(long id);

    List<User> queryUsers();

}
