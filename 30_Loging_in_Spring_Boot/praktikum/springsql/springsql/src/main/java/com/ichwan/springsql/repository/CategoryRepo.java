package com.ichwan.springsql.repository;

import com.ichwan.springsql.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepo extends JpaRepository<Categories, Long> {
    @Query(value = "SELECT * FROM categories")
    public Categories getCategories();
}
