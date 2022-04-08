package com.ichwan.nosql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String customer_name;
    private String transaction_details;
    private String is_paid;
    private String created_at;

}
