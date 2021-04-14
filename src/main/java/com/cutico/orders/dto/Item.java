package com.cutico.orders.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private int id;
    private String type;
    private int quantity;
    private String instructions;
}
