package com.example.janrekas.pizzaaplicationtest.Response;

import com.example.janrekas.pizzaaplicationtest.Domain.model.Size;

import java.math.BigDecimal;

public class SizesDto {

private Integer id;
private Size size;
private Integer price;

    public SizesDto(Integer id, Size size, Integer price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
