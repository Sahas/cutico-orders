package com.cutico.orders.service.dao.repository;

import com.cutico.orders.model.OrderDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderDoc, Integer> {

}
