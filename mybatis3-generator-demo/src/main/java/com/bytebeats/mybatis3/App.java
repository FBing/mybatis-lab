package com.bytebeats.mybatis3;

import com.bytebeats.mybatis3.domain.admin.User;
import com.bytebeats.mybatis3.domain.trade.Order;
import com.bytebeats.mybatis3.service.admin.UserService;
import com.bytebeats.mybatis3.service.trade.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-14 13:28
 */
public class App {

    public static void main(String[] args){

        new App().run();
    }

    private void run(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userService");

        List<User> userList = userService.getUsers();
        System.out.println("userList size:"+userList.size());

        OrderService orderService = (OrderService) context.getBean("orderService");

        List<Order> orderList = orderService.getOrderList(3);
        System.out.println("orderList size:"+orderList.size());

        context.close();
    }

}
