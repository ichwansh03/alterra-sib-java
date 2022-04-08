package com.ichwan.nosql.controller;

import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        Product productCreated = productService.createProduct(product);
        return ResponseEntity.ok(productCreated);
    }

    @GetMapping
    public ResponseEntity<?> listProduct(){
        List<Product> products = productService.findAllProduct();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> product(@PathVariable("id") String id){
        try{
            Product product = productService.findByIdProduct(id);
            return ResponseEntity.ok(product);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        try {
            Product productUpdated = productService.updateProduct(id, product);
            return ResponseEntity.ok(productUpdated);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try{
            productService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
