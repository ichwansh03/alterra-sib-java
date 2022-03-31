package com.ichwan.springsql.service;

import com.ichwan.springsql.model.Product;
import com.ichwan.springsql.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product getProduct(Long id) {
        return productRepo.findById(id).orElse(null);
    }
}
