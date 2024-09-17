package com.keniding.tomato.restaurant.repository;

import com.keniding.tomato.restaurant.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryRestaurant extends MongoRepository<Restaurant, String> {
}
