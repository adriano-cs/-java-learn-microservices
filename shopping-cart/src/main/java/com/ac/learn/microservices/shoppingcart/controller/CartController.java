package com.ac.learn.microservices.shoppingcart.controller;

import com.ac.learn.microservices.shoppingcart.entity.Cart;
import com.ac.learn.microservices.shoppingcart.entity.Item;
import com.ac.learn.microservices.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable("id") Long id, @RequestBody Item item) {

        Cart cart = this.cartRepository.findById(id).orElse(new Cart(id));
        cart.addItems(item);

        return this.cartRepository.save(cart);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> get(@PathVariable("id") Long id) {
        return this.cartRepository.findById(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Long id) {
        this.cartRepository.deleteById(id);
    }

}
