package com.ichwan.nosql.repository;

import com.ichwan.nosql.model.Product;
import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product,Long> {

}
