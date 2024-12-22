package com.mycode.eshops.service.order;

import com.mycode.eshops.dto.OrderDto;
import com.mycode.eshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}
