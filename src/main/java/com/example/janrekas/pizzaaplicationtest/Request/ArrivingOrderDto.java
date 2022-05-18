package com.example.janrekas.pizzaaplicationtest.Request;

import java.util.List;

public class ArrivingOrderDto {
    private ArrivingPersonOrderDto person;
    private List<ArrivingPizzaOrderDto> pizzas;

    public ArrivingOrderDto(ArrivingPersonOrderDto person, List<ArrivingPizzaOrderDto> pizzas) {
        this.person = person;
        this.pizzas = pizzas;
    }

    public ArrivingPersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(ArrivingPersonOrderDto person) {
        this.person = person;
    }

    public List<ArrivingPizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<ArrivingPizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }
}
