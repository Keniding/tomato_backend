package com.keniding.tomato.dish.repository;

import com.keniding.tomato.dish.model.Dish;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RepositoryDish extends MongoRepository<Dish, String> {
    List<Dish> findByCategoriaNombre(String categoriaNombre);
}
