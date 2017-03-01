package com.bytebeats.mybatis3.service;

import com.bytebeats.mybatis3.domain.admin.User;
import com.bytebeats.mybatis3.domain.trade.Order;
import com.bytebeats.mybatis3.service.admin.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testQuery(){
        List<User> userList = userService.getUsers();
        System.out.println("userList size:"+userList.size());
    }

    @Test
    public void testInsert(){
        User user = getUser();
        boolean result = userService.insert(user);
        System.out.println("user id:"+user.getId()+", result:"+result);
    }

    private User getUser(){
        User user = new User();
        user.setName("ricky");
        user.setPassword("abc");
        user.setRole("admin");
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        return user;
    }
}
