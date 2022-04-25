package com.ichwan.springsql.service;

import com.ichwan.springsql.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public ProductService getProductByCategory(Long id) {
        return (ProductService) productRepo.findById(id).orElse(null);
    }
}
