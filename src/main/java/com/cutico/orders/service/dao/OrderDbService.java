package com.cutico.orders.service.dao;

import com.cutico.orders.model.OrderDoc;
import com.cutico.orders.service.dao.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderDbService {

  private final OrderRepository orderRepository;

  public OrderDbService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public OrderDoc save(final OrderDoc orderDoc){
      log.info("Creating order");
      return this.orderRepository.save(orderDoc);

  }
}
