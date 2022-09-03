package com.grpc.product.services;

import com.grpc.product.dtos.ProductDTO;
import org.springframework.http.ResponseEntity;

public interface IProductService {

    public ProductDTO getProduct(Long id);
    public ResponseEntity<String> postProduct(ProductDTO product);
}
