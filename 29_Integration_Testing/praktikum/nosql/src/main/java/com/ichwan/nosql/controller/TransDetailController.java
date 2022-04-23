package com.ichwan.nosql.controller;

import com.ichwan.nosql.model.TransactionDetail;
import com.ichwan.nosql.service.TransDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TransDetailController {

    @Autowired
    private TransDetailService transDetailService;

    @PostMapping("/transdetail")
    public ResponseEntity<?> createTransDetail(@RequestBody TransactionDetail transactionDetail){
        TransactionDetail transDetailCreated = transDetailService.createTransDetail(transactionDetail);
        return ResponseEntity.ok(transDetailCreated);
    }

    @GetMapping("/transdetail")
    public ResponseEntity<?> listTransDetail(){
        List<TransactionDetail> transactionDetails = transDetailService.findAllTransDetail();
        return ResponseEntity.ok(transactionDetails);
    }

    @GetMapping("/transdetail/{id}")
    public ResponseEntity<?> transDetail(@PathVariable("id") String id){
        try{
            TransactionDetail transactionDetail = transDetailService.findByIdTransDetail(id);
            return ResponseEntity.ok(transactionDetail);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/transdetail/{id}")
    public ResponseEntity<?> updateTransDetail(@PathVariable("id") String id, @RequestBody TransactionDetail transactionDetail){
        try{
            TransactionDetail transDetailUpdated = transDetailService.updateTransDetail(id, transactionDetail);
            return ResponseEntity.ok(transDetailUpdated);
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/transdetail/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try {
            transDetailService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
