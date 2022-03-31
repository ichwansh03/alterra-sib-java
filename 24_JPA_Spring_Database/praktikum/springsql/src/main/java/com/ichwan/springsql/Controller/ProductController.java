package com.ichwan.springsql.Controller;

import com.ichwan.springsql.model.Product;
import com.ichwan.springsql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    Product getProductById(@PathVariable("id") Long id){
        return  productService.getProduct(id);
    }
}
