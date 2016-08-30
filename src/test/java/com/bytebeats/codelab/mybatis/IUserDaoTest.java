package com.bytebeats.codelab.mybatis;

import com.bytebeats.codelab.mybatis.dao.IUserDao;
import com.bytebeats.codelab.mybatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-08-30 10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class IUserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void testInsertBatch(){

        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setName("ricky");
        user1.setPassword("1234");
        user1.setAge(27);
        user1.setEmail("ricky_feng@163.com");
        user1.setGender(1);
        user1.setRegisterTime(new Date());
        userList.add(user1);

        User user2 = new User();
        user2.setName("张三");
        user2.setPassword("bat");
        user2.setAge(25);
        user2.setEmail("ricky_feng@163.com");
        user2.setGender(0);
        user2.setRegisterTime(new Date());
        userList.add(user2);

        int update = userDao.insertBatch(userList);
        System.out.println("update:"+update);

        for(User user: userList){
            System.out.println("id:"+user.getId());
        }
    }
}
