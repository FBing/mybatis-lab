package com.mindflow.mybatis3.mapper.trade;

import com.mindflow.mybatis3.model.trade.Order;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-14 13:41
 */
public interface OrderMapper {

    int insert(Order order);

    List<Order> getOrderList(long uid);
}
