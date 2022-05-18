package com.example.janrekas.pizzaaplicationtest.Response;

import com.example.janrekas.pizzaaplicationtest.Domain.model.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderStatusDto {
    private Status status;

    @JsonFormat(pattern = "dd-mm-YYYY")
    private Date createdAt;

    @JsonFormat(pattern = "dd-mm-YYYY")
    private Date updatedAt;

    @JsonFormat(pattern = "dd-mm-YYYY")
    private Date expectedAt;

    public OrderStatusDto() {

    }

    public OrderStatusDto(Status status, Date createdAt, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
