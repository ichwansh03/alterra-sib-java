package com.ichwan.springsql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cateogry_id")
    private Long catId;

    @Column(name = "category_name")
    private String categoryName;
}
