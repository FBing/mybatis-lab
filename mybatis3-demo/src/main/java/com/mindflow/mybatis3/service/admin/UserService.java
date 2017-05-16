package com.mindflow.mybatis3.service.admin;

import com.mindflow.mybatis3.model.admin.User;
import com.mindflow.mybatis3.mapper.admin.UserMapper;
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
    private UserMapper userMapper;

    public boolean insert(User user){
        return userMapper.insert(user) > 0;
    }

    public List<User> getUsers(){
        return userMapper.getUsers();
    }
}
