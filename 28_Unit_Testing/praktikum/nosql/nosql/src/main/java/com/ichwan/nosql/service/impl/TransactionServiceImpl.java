package com.ichwan.nosql.service.impl;

import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.model.Transaction;
import com.ichwan.nosql.repository.TransRepo;
import com.ichwan.nosql.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransRepo transRepo;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transRepo.save(transaction);
    }

    @Override
    public List<Transaction> findAllTransaction() {
        return transRepo.findAll();
    }

    @Override
    public Transaction findByIdTransaction(String id) {
        return transRepo.findById(id).orElseThrow(() -> {
            throw new Error("produk tidak ditemukan");
        });
    }

    @Override
    public Transaction updateTransaction(String id, Transaction transaction) {

        Transaction transById = this.findByIdTransaction(id);
        transById.setCustomer_name(transaction.getCustomer_name());
        transById.setTransaction_details(transaction.getTransaction_details());
        transById.setIs_paid(transaction.getIs_paid());
        transById.setCreated_at(transaction.getCreated_at());

        return transRepo.save(transById);
    }

    @Override
    public void delete(String id) {
        Transaction transById = this.findByIdTransaction(id);
        transRepo.delete(transById);
    }
}
