package com.cutico.orders.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetails {
    private int userId;
    private String userUuid;
    private String userName;
    private String firstName;
    private String lastName;
    private long mobile;
    private String emailId;
    private Address address;
}
