package com.shop.productservice.service;

import com.shop.productservice.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String productId);
}
