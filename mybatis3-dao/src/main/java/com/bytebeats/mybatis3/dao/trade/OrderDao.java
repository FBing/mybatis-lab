package com.bytebeats.mybatis3.dao.trade;

import com.bytebeats.mybatis3.domain.trade.Order;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-03-01 22:38
 */
public interface OrderDao {

    int insert(Order order);

    List<Order> getOrderList(long userId);
}
