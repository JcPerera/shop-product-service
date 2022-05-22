package com.shop.productservice.service;

import com.shop.productservice.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProduct(String productId);

    Product createProduct(Product product);

    void deleteProduct(String productId);

    Product updateProduct(Product product);
}
