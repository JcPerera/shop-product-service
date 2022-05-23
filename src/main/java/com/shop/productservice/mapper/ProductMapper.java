package com.shop.productservice.mapper;

import com.shop.productservice.dto.ProductDTO;
import com.shop.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO productToProductDto(Product product);
    Product ProductDtoToProduct(ProductDTO productDto);

    List<ProductDTO> productListToProductDtoList(List<Product> products);

    List<Product> productDtoListToProductList(List<ProductDTO> productDtos);
}
