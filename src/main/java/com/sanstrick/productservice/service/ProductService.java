package com.sanstrick.productservice.service;

import com.sanstrick.productservice.model.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
}
