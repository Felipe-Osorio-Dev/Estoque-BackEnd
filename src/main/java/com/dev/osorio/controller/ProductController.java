package com.dev.osorio.controller;

import com.dev.osorio.dto.response.ProductResponse;
import com.dev.osorio.exception.ProductNotFoundException;
import com.dev.osorio.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{data}")
    public ResponseEntity<ProductResponse> getProductByData(@PathVariable(name = "data") String data) {
        ProductResponse response = productService.findProductByData(data);

        if (response == null) {
            throw  new ProductNotFoundException("Produto nao encontrado/nao existe!!");
        }

        return  ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
