package com.grpc.product.service.implementation;

import com.grpc.product.dtos.ProductDTO;
import com.grpc.product.entities.Product;
import com.grpc.product.repositories.IProductRepository;
import com.grpc.product.services.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService implements IProductService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private IProductRepository productRepository;

    @Override
    public ProductDTO getProduct(Long id) {
        Product aux = productRepository.findById(id).get();
        ProductDTO productDTO = modelMapper.map(aux,ProductDTO.class);
        return productDTO;
    }

    @Override
    public ResponseEntity<String> postProduct(ProductDTO product) {
        Product aux = modelMapper.map(product,Product.class);
        productRepository.save(aux);
        return ResponseEntity.status(HttpStatus.CREATED).body("El producto fue agregado correcatamente");
    }


}
