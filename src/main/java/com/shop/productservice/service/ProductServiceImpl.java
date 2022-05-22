package com.shop.productservice.service;

import com.shop.productservice.model.Product;
import com.shop.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product getProductById(String productId) {
        Product product = productRepository.findProductById(productId);
        return product;
    }
}
