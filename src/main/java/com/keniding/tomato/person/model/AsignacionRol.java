package com.keniding.tomato.person.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

@Data
@Document(collection = "asignaciones_roles")
public class AsignacionRol {
    @Id
    private String id;

    @DBRef
    private Trabajador trabajador;

    @DBRef
    private Rol rol;

    private Date fechaAsignacion;
}
