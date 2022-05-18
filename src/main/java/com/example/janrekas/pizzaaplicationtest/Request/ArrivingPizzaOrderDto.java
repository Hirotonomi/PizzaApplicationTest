package com.example.janrekas.pizzaaplicationtest.Request;

public class ArrivingPizzaOrderDto {
    private Integer sizeId;
    private Integer count;

    public ArrivingPizzaOrderDto(Integer sizeId, Integer count) {
        this.sizeId = sizeId;
        this.count = count;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
