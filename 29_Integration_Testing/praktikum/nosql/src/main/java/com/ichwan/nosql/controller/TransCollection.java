package com.ichwan.nosql.controller;

import com.ichwan.nosql.model.Transaction;
import com.ichwan.nosql.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TransCollection {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    public ResponseEntity<?> createTrans(@RequestBody Transaction transaction){
        Transaction transCreated = transactionService.createTransaction(transaction);
        return ResponseEntity.ok(transCreated);
    }

    @GetMapping("/transactions")
    public ResponseEntity<?> listTransaction(){
        List<Transaction> transactions = transactionService.findAllTransaction();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/transactions/{id}")
    public ResponseEntity<?> transaction(@PathVariable("id") String id){
        try{
            Transaction transaction = transactionService.findByIdTransaction(id);
            return ResponseEntity.ok(transaction);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/transactions/{id}")
    public ResponseEntity<?> updateTransaction(@PathVariable("id") String id, @RequestBody Transaction transaction){
        try{
            Transaction transUpdated = transactionService.updateTransaction(id, transaction);
            return ResponseEntity.ok(transUpdated);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/transactions/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try{
            transactionService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
