package com.shop.productservice.service;

import com.shop.productservice.dto.ProductDTO;
import com.shop.productservice.mapper.ProductMapper;
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

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.productListToProductDtoList(products);
    }

    @Override
    public ProductDTO getProduct(String productId) {
        Product product = productRepository.findById(productId).orElse(null);
        return productMapper.productToProductDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productMapper.ProductDtoToProduct(productDTO);
        product.setCreatedAt(new Date());
        product.setUpdatedAt(new Date());
        Product savedProduct = productRepository.save(product);
        return productMapper.productToProductDto(savedProduct);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Product product = productRepository.findById(productDTO.getId()).orElse(null);
        ProductDTO updatedDto = null;
        if(product != null){
            product = productMapper.ProductDtoToProduct(productDTO);
            Product updatedProduct = productRepository.save(product);
            updatedDto = productMapper.productToProductDto(updatedProduct);
        }
        return updatedDto;
    }
}
