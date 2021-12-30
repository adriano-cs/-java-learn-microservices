package com.ac.learn.microservices.shoppingcart.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("cart_item")
public class Item {
    private Long productId;
    private Long amount;
}
