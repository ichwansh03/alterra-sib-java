package com.ichwan.springsql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Brands {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;
}
