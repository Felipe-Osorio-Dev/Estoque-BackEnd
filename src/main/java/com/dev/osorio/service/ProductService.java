package com.dev.osorio.service;

import com.dev.osorio.dto.response.ProductResponse;
import com.dev.osorio.entity.ProductEntity;
import com.dev.osorio.exception.ProductNotFoundException;
import com.dev.osorio.mapper.ProductMapper;
import com.dev.osorio.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductService(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public ProductResponse findProductByData(String data) {

        if (data.matches("[0-9]+")) {
            if (data.length() == 13) {
                //chamar query findByCodProduto
                Optional<ProductEntity> entity = productRepository.findByCodProduct(data);
                return entity.map(productMapper::toProductResponse)
                        .orElseThrow(() -> new ProductNotFoundException("Produto nao encontrado/nao existe!!"));
            }
            //chamar query findByID
            Optional<ProductEntity> entity = productRepository.findById(Long.valueOf(data));
            return entity.map(productMapper::toProductResponse)
                    .orElseThrow(() -> new ProductNotFoundException("Produto nao encontrado/nao existe!!"));
        }

        //Chamar query findByName
        Optional<ProductEntity> entity = productRepository.findByName(data);
        return entity.map(productMapper::toProductResponse)
                .orElseThrow(() -> new ProductNotFoundException("Produto nao encontrado/nao existe!!"));
    }
}
