package com.shop.productservice.controller;

import com.shop.productservice.dto.ProductDTO;
import com.shop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO product){
        return ResponseEntity.ok(productService.createProduct(product));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable(value = "productId") String productId) {
        return ResponseEntity.ok(productService.getProduct(productId));
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "productId") String productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable(value = "productId") String productId, @RequestBody ProductDTO product){
        product.setId(productId);
        return ResponseEntity.ok(productService.updateProduct(product));
    }
}
