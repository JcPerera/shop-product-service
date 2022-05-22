package com.shop.productservice.service;

import com.shop.productservice.model.Product;
import com.shop.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        product.setCreatedAt(new Date());
        product.setUpdatedAt(new Date());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Product product) {
        Product oldProduct = productRepository.findById(product.getId()).orElse(null);
        if(oldProduct != null){
            oldProduct.setTitle(product.getTitle());
            oldProduct.setDesc(product.getDesc());
            oldProduct.setImg(product.getImg());
            oldProduct.setCategories(product.getCategories());
            oldProduct.setSize(product.getSize());
            oldProduct.setColor(product.getColor());
            oldProduct.setPrice(product.getPrice());
            oldProduct.setInStock(product.isInStock());
            oldProduct.setUpdatedAt(new Date());
            productRepository.save(product);
        }
        return product;
    }
}
