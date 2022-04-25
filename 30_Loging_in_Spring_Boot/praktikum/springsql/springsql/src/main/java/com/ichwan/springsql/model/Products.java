package com.ichwan.springsql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long prodId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "cateogry_id")
    private Long catId;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "list_price")
    private Long listPrice;
}
