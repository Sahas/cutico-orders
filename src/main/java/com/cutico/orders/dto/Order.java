package com.cutico.orders.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
public class Order {
    private int id;
    private UserDetails userDetails;
    private String status;
    private List<Item> items;
    private Pickup pickup;
    private Delivery delivery;
    private Payment payment;

}
