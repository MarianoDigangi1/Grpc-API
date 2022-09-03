package com.grpc.product.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class ProductModel {

    private Long id;
    private String name;
    private String description;
    private List<String> photos;
    private float price;
    private int available;
    private LocalDate date;

}
