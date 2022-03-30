package com.spring.ichwan.controller;

import com.spring.ichwan.entity.Product;
import com.spring.ichwan.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/posts")
    public List<Product> getAllCategories(){
        return productRepo.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Product> getDetailProduct(@PathVariable Long id){
        return productRepo.findById(id);
    }

    @PostMapping(value = "/posts", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Product createProduct(@RequestBody Product data){
        return productRepo.save(data);
    }

    @PutMapping("/posts/{id}")
    public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product data){
        Optional<Product> productById = productRepo.findById(id);

        productById.ifPresent(res -> {
            res.setName(data.getName());
            res.setDescription(data.getDescription());
            res.setStock(data.getStock());
            res.setPrice(data.getPrice());
        });

        return productById;
    }

    @DeleteMapping("/posts/{id}")
    public void deleteProduct(@PathVariable Long id){
        Optional<Product> productById = productRepo.findById(id);

        productById.ifPresent(res -> {
            productRepo.delete(res);
        });
    }
}
