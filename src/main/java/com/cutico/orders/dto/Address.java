package com.cutico.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private  String firstLine;
    private String secondLine;
    private String area;
    private String landmark;
    private String city;
    private String state;
    private int pincode;
    private int areaId;
    private int cityId;
    private int stateId;
}
