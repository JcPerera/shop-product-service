package com.shop.productservice.service;

import com.shop.productservice.dto.ProductDTO;
import com.shop.productservice.model.Product;
import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProduct(String productId);

    ProductDTO createProduct(ProductDTO product);

    void deleteProduct(String productId);

    ProductDTO updateProduct(ProductDTO product);
}
