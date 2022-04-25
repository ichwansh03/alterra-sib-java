package com.ichwan.springsql.repository;

import com.ichwan.springsql.model.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductRepo extends JpaRepository<Products, Long> {

    Page<Products> findAllProduct(Pageable pageable);
}
