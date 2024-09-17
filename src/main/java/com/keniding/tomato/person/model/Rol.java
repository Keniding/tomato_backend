package com.keniding.tomato.person.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "roles")
public class Rol {
    @Id
    private String id;

    private String nombreRol;
    private String descripcion;
}
