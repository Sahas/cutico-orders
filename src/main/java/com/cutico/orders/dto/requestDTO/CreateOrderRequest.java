package com.cutico.orders.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    //User Details
    private String firstName;
    private String lastName;
    private String emailId;
    private long mobile;
    private String firstLine;
    private String secondLine;
    private String landmark;
    private String city;
    private int pincode;
    private String state;


    // Item
    private List<ItemRequest> items;

    // Pickup details
    private PickupRequest pickup;
}
