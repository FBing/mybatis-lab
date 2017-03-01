package com.bytebeats.mybatis3.service.admin;

import com.bytebeats.mybatis3.dao.admin.UserDao;
import com.bytebeats.mybatis3.domain.admin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-14 14:17
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean insert(User user){
        return userDao.insert(user) > 0;
    }

    public List<User> getUsers(){
        return userDao.getUsers();
    }
}
