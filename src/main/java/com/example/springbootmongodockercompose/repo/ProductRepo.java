package com.example.springbootmongodockercompose.repo;

import com.example.springbootmongodockercompose.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {
}
