package com.ac.learn.microservices.shoppingcart.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@RedisHash("cart")
public class Cart {

    @Id
    private Long id;
    private List<Item> items;

    public void addItems(Item item) {
        if(items == null) {
            items = new ArrayList<>();
        }

        items.add(item);
    }

    public Cart(Long id) {
        this.id = id;
    }
}
