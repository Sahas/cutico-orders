package com.cutico.orders.service;

import com.cutico.orders.dto.Address;
import com.cutico.orders.dto.Item;
import com.cutico.orders.dto.Order;
import com.cutico.orders.dto.UserDetails;
import com.cutico.orders.dto.enums.City;
import com.cutico.orders.dto.requestDTO.CreateOrderRequest;
import com.cutico.orders.dto.requestDTO.ItemRequest;
import com.cutico.orders.model.OrderDoc;
import com.cutico.orders.service.dao.OrderDbService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
  private final OrderDbService orderDbService;

  public OrderService(OrderDbService orderDbService) {
    this.orderDbService = orderDbService;
  }

  public void createOrder(final CreateOrderRequest createOrderRequest){
    final Address address  = Address.builder().firstLine(createOrderRequest.getFirstLine())
            .secondLine(createOrderRequest.getSecondLine())
            .city(createOrderRequest.getCity())
            .cityId(City.cityId(createOrderRequest.getCity()))
            .landmark(createOrderRequest.getLandmark())
            .pincode(createOrderRequest.getPincode())
            .state(createOrderRequest.getState())
            .build();
    final  UserDetails userDetails = UserDetails.builder().firstName(createOrderRequest.getFirstName())
               .lastName(createOrderRequest.getLastName())
               .emailId(createOrderRequest.getEmailId())
               .mobile(createOrderRequest.getMobile())
               .address(address).build();
    final List<Item> items = new ArrayList<>();
    for(ItemRequest itemRequest : createOrderRequest.getItems()){
      Item item = Item.builder().type(itemRequest.getType()).quantity(itemRequest.getQuantity()).instructions(itemRequest.getInstructions()).build();
      items.add(item);
    }
    Order order = Order.builder().userDetails(userDetails).status("BOOKED").items(items).build();
    OrderDoc orderDoc = OrderDoc.builder().order(order).build();
    orderDbService.save(orderDoc);

  }
}
