package com.ichwan.nosql.repository;

import com.ichwan.nosql.model.TransactionDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransDetailRepo extends MongoRepository<TransactionDetail, String> {
}
