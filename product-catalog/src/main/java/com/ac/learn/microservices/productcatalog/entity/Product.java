package com.ac.learn.microservices.productcatalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "product")
public class Product {

    @Id
    private Long id;
    private String name;
    private Long amount;
}
