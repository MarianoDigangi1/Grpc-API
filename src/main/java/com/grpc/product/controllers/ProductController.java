package com.grpc.product.controllers;

import com.grpc.product.dtos.ProductDTO;
import com.grpc.product.service.implementation.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get")
    public ProductDTO gerProduct(Long id){
        return productService.getProduct(id);
    }


}
