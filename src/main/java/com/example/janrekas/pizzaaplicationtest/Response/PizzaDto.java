package com.example.janrekas.pizzaaplicationtest.Response;

import java.util.List;

public class PizzaDto {

    private Integer id;
    private String name;
    private List<SizesDto> sizes;

    public PizzaDto(){

    }

    public PizzaDto(Integer id, String name, List<SizesDto> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizesDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizesDto> sizes) {
        this.sizes = sizes;
    }
}

