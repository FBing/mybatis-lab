package com.mindflow.mybatis3.mapper.admin;

import com.mindflow.mybatis3.model.admin.User;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-14 13:41
 */
public interface UserMapper {

    int insert(User user);

    List<User> getUsers();
}
