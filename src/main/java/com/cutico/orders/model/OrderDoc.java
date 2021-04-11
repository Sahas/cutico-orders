package com.cutico.orders.model;

import com.cutico.orders.dto.Order;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
@Data
@Builder
public class OrderDoc {
  @Id private String id;

  private Order order;
}
