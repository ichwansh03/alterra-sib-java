package com.ichwan.nosql.service;

import com.ichwan.nosql.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> findAllProduct();

    Product findByIdProduct(String id);

    Product updateProduct(String id, Product product);

    void delete(String id);
}
