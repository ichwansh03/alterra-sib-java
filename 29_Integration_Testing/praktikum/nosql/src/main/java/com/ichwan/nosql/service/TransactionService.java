package com.ichwan.nosql.service;

import com.ichwan.nosql.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);

    List<Transaction> findAllTransaction();

    Transaction findByIdTransaction(String id);

    Transaction updateTransaction(String id, Transaction transaction);

    void delete(String id);
}
