package com.shop.productservice.controller;

import com.shop.productservice.model.Product;
import com.shop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable(value = "productId") String productId) {
        return ResponseEntity.ok(productService.getProductById(productId));
    }
}
