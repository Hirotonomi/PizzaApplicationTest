package com.example.janrekas.pizzaaplicationtest.Response;

import java.util.List;

public class OrdersDto {

    private List<OrderDto> orders;

    public OrdersDto() {

    }

    public OrdersDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}