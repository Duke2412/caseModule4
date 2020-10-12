package com.example.demo.repository;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
//    Iterable<Product> findAllByProduct(Product product);

    Page<Product> findAllByNameContaining(String name , Pageable pageable);

    Page<Product> findAllByCategory(Category category, Pageable pageable);


}
