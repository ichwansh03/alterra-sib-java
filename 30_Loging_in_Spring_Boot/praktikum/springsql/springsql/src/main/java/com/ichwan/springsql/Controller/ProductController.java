package com.ichwan.springsql.Controller;

import com.ichwan.springsql.model.Categories;
import com.ichwan.springsql.model.Products;
import com.ichwan.springsql.repository.CategoryRepo;
import com.ichwan.springsql.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;

    @GetMapping("/posts")
    public List<Categories> getAllProduct(){
        log.error("log error here");
        log.debug("log debug here");
        log.info("info log here");
        return categoryRepo.findAll();
    }

}
