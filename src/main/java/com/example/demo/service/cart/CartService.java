package com.example.demo.service.cart;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.model.User;

public interface CartService {

    Iterable<Cart> findAll();

    Cart findByCartId(Long cart_id);

    void save(Cart cart);

    void remove(Long cart_id);

    Iterable<Cart> findAllByUser(User user);

    Iterable<Cart> findAllByOrderNumberAndUser(Long orderNumber, User user);

    Cart findByProductAndUserAndOrderNumber(Product product, User user, Long orderNumber);

    Long countByOrderNumberAndUser(Long orderNumber, User user);
}

