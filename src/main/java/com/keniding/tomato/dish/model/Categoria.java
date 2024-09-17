package com.keniding.tomato.dish.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "categorias")
public class Categoria {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
}
