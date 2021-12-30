package com.ac.learn.microservices.productcatalog.controller;

import com.ac.learn.microservices.productcatalog.entity.Product;
import com.ac.learn.microservices.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return this.productRepository.save(product);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    Optional<Product> getById(@PathVariable Long id) {
        return this.productRepository.findById(id);
    }
}
