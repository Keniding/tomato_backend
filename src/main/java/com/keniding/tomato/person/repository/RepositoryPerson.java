package com.keniding.tomato.person.repository;

import com.keniding.tomato.person.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RepositoryPerson extends MongoRepository<Person, String> {
    Optional<Person> findByEmail(String email);
}
