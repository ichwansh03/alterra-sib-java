package com.ichwan.nosql.controller;

import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        Product productCreated = productService.createProduct(product);
        return ResponseEntity.ok(productCreated);
    }

    @GetMapping("/products")
    public ResponseEntity<?> listProduct(){
        List<Product> products = productService.findAllProduct();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> product(@PathVariable("id") Long id){
        try{
            Product product = productService.findByIdProduct(id);
            return ResponseEntity.ok(product);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/products/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        try {
            Product productUpdated = productService.updateProduct(id, product);
            return ResponseEntity.ok(productUpdated);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            productService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
