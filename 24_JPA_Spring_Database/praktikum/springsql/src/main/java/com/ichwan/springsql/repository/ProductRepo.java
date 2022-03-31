package com.ichwan.springsql.repository;

import com.ichwan.springsql.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
