package com.bytebeats.mybatis3.service;

import com.bytebeats.mybatis3.domain.trade.Order;
import com.bytebeats.mybatis3.service.trade.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testQuery(){
        List<Order> orderList = orderService.getOrderList(3);
        System.out.println("orderList size:"+orderList.size());
    }

    @Test
    public void testInsert(){
        Order order = getOrder();
        boolean result =  orderService.insert(order);
        System.out.println("order id:"+order.getId()+", result:"+result);
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

}
