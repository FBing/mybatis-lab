package com.bytebeats.mybatis3.service.trade;

import com.bytebeats.mybatis3.domain.trade.Order;
import com.bytebeats.mybatis3.mapper.trade.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-14 14:19
 */
@Service("orderService")
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public boolean insert(Order order){
        return orderMapper.insert(order) > 0;
    }

    public List<Order> getOrderList(long userId){
        return orderMapper.getOrderList(userId);
    }
}
