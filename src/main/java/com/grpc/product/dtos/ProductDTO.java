package com.grpc.product.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private List<String> photos;
    private float price;
    private int available;
    private LocalDate date;
}
