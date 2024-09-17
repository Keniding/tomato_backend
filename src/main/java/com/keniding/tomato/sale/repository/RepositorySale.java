package com.keniding.tomato.sale.repository;

import com.keniding.tomato.sale.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RepositorySale extends MongoRepository<Sale, String> {
    List<Sale> findByIdCliente(String idCliente);
}
