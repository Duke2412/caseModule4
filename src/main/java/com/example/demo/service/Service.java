package com.example.demo.service;


import com.example.demo.exception.NotFoundException;

import java.util.Optional;

public interface Service<T> {
    Iterable<T> findAll();

    T findById(Long id) throws NotFoundException;

    void save(T model);

    void remove(Long id);
}

