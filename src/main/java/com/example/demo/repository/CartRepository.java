package com.example.demo.repository;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
    Iterable<Cart> findAllByUser(User user);

    Iterable<Cart> findAllByOrderNumberAndUser(Long orderNumber, User user);

    Cart findByProductAndUserAndOrderNumber(Product product, User user, Long orderNumber);

}
