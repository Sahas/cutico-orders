package com.cutico.orders.controller;

import com.cutico.orders.dto.requestDTO.CreateOrderRequest;
import com.cutico.orders.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    private final OrderService orderService;

    public OrdersController(final OrderService  orderService){
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/orders")
    public void createOrder(@RequestBody final CreateOrderRequest orderRequest){
        this.orderService.createOrder(orderRequest);
    }

}
