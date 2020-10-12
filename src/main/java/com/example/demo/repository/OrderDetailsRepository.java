package com.example.demo.repository;

import com.example.demo.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {

    OrderDetails findByOrderNumber(Long orderNumber);
}
