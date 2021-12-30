package com.ac.learn.microservices.productcatalog.repository;

import com.ac.learn.microservices.productcatalog.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
