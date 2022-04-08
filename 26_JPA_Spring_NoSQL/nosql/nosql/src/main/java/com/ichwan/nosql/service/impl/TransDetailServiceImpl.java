package com.ichwan.nosql.service.impl;

import com.ichwan.nosql.model.TransactionDetail;
import com.ichwan.nosql.repository.TransDetailRepo;
import com.ichwan.nosql.service.TransDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransDetailServiceImpl implements TransDetailService {

    @Autowired
    private TransDetailRepo transDetailRepo;

    @Override
    public TransactionDetail createTransDetail(TransactionDetail transactionDetail) {
        return transDetailRepo.save(transactionDetail);
    }

    @Override
    public List<TransactionDetail> findAllTransDetail() {
        return transDetailRepo.findAll();
    }

    @Override
    public TransactionDetail findByIdTransDetail(String id) {
        return transDetailRepo.findById(id).orElseThrow(() -> {
            throw new Error("transaksi detail tidak ditemukan");
        });
    }

    @Override
    public TransactionDetail updateTransDetail(String id, TransactionDetail transactionDetail) {

        TransactionDetail transDetailById = this.findByIdTransDetail(id);
        transDetailById.setProduct_id(transactionDetail.getProduct_id());
        transDetailById.setTransaction_id(transactionDetail.getTransaction_id());
        transDetailById.setQuantity(transactionDetail.getQuantity());

        return transDetailRepo.save(transDetailById);
    }

    @Override
    public void delete(String id) {
        TransactionDetail transDetailById = this.findByIdTransDetail(id);
        transDetailRepo.delete(transDetailById);
    }
}
