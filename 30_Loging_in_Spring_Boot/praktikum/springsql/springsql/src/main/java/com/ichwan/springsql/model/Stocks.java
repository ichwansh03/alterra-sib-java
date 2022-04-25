package com.ichwan.springsql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "product_id")
    private Long prodId;

    @Column(name = "quantity")
    private int quantity;
}
