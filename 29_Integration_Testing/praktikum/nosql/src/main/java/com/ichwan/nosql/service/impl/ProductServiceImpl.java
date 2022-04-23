package com.ichwan.nosql.service.impl;

import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.repository.ProductRepo;
import com.ichwan.nosql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product findByIdProduct(Long id) {
        return productRepo.findById(id).orElseThrow(() -> {
            throw new Error("produk tidak ditemukan");
        });
    }

    @Override
    public Product updateProduct(Long id, Product product) {

        Product productById = this.findByIdProduct(id);
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());

        return productRepo.save(productById);
    }

    @Override
    public void delete(Long id) {
        Product productById = this.findByIdProduct(id);
        productRepo.delete(productById);
    }
}
