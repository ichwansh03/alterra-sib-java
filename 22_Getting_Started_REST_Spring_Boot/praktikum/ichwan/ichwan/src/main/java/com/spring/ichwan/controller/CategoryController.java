package com.spring.ichwan.controller;

import com.spring.ichwan.entity.Category;
import com.spring.ichwan.repository.CategoryRepo;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CategoryController {

    @Autowired
    private CategoryRepo categoryRepo;

    @GetMapping("/posts")
    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Category> getDetailCategory(@PathVariable Long id){
        return categoryRepo.findById(id);
    }

    @PostMapping(value = "/posts", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Category createCategory(@RequestBody Category data){
        return categoryRepo.save(data);
    }

    @PutMapping("/posts/{id}")
    public Optional<Category> updateCategory(@PathVariable Long id, @RequestBody Category data){
        Optional<Category> categoryById = categoryRepo.findById(id);

        categoryById.ifPresent(res -> {
            res.setName(data.getName());
            res.setCollege(data.getCollege());
        });

        return categoryById;
    }

    @DeleteMapping("/posts/{id}")
    public void deleteCategory(@PathVariable Long id){
        Optional<Category> categoryById = categoryRepo.findById(id);

        categoryById.ifPresent(res -> {
            categoryRepo.delete(res);
        });
    }
}
