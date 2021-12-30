package com.ac.learn.microservices.shoppingcart.repository;

import com.ac.learn.microservices.shoppingcart.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
