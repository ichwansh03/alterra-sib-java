package com.ichwan.nosql.service;

import com.ichwan.nosql.model.TransactionDetail;

import java.util.List;

public interface TransDetailService {

    TransactionDetail createTransDetail(TransactionDetail transactionDetail);

    List<TransactionDetail> findAllTransDetail();

    TransactionDetail findByIdTransDetail(String id);

    TransactionDetail updateTransDetail(String id, TransactionDetail transactionDetail);

    void delete(String id);
}
