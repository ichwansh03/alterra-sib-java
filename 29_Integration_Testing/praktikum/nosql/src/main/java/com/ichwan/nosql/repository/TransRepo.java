package com.ichwan.nosql.repository;

import com.ichwan.nosql.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransRepo extends MongoRepository<Transaction, String> {
}
