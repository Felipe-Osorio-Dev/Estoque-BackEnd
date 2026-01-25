package com.dev.osorio.mapper;

import com.dev.osorio.dto.response.ProductResponse;
import com.dev.osorio.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse toProductResponse(ProductEntity productEntity);
}
