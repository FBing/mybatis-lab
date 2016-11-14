package com.bytebeats.mybatis3;

import com.bytebeats.mybatis3.domain.admin.User;
import com.bytebeats.mybatis3.domain.trade.Order;
import com.bytebeats.mybatis3.service.admin.UserService;
import com.bytebeats.mybatis3.service.trade.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
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

        User user = getUser();
        UserService userService = (UserService) context.getBean("userService");
        boolean result = userService.insert(user);
        System.out.println("user id:"+user.getId()+", result:"+result);

        List<User> userList = userService.getUsers();
        System.out.println("userList size:"+userList.size());

        Order order = getOrder();
        OrderService orderService = (OrderService) context.getBean("orderService");
        result =  orderService.insert(order);
        System.out.println("order id:"+order.getId()+", result:"+result);

        List<Order> orderList = orderService.getOrderList(3);
        System.out.println("orderList size:"+orderList.size());

        context.close();
    }

    private Order getOrder(){
        Order order = new Order();
        order.setUserId(3);
        order.setCategory("IT/数码");
        order.setTotalPrice(12500.5d);
        order.setAmount(10);
        order.setAddress("北京市朝阳区");
        order.setCreateTime(new Date());
        order.setModifyTime(new Date());
        return order;
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
