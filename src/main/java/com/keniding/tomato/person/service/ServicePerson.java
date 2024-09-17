package com.keniding.tomato.person.service;

import com.keniding.tomato.person.model.Person;
import com.keniding.tomato.person.repository.RepositoryPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePerson {

    @Autowired
    private RepositoryPerson personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }

    public Optional<Person> getPersonByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    public Person updatePerson(String id, Person personDetails) {
        // falta logica
        return personDetails;
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}

