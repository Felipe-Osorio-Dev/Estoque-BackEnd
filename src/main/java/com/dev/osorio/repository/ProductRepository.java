package com.dev.osorio.repository;

import com.dev.osorio.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    Optional<ProductEntity> findByName(String name);
    Optional<ProductEntity> findByCodProduct(String codProduct);
}
