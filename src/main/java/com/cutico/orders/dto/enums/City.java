package com.cutico.orders.dto.enums;

public enum City {
  HYDERABAD(1);

  private int cityId;

  City(int cityId) {
    this.cityId = cityId;
  }

  public static int cityId(String city) {
    return HYDERABAD.cityId;
  }
}
