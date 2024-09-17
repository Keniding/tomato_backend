package com.keniding.tomato.person.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

@Data
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;
    @DBRef
    private Person person;
    private Date fechaRegistro;
}
