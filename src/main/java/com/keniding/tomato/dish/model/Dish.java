package com.keniding.tomato.dish.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@Document(collection = "platos")
public class Dish {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private Double precio;

    @DBRef
    private Categoria categoria;
}
