package com.keniding.tomato.person.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;

@Data
@Document(collection = "trabajadores")
public class Trabajador {
    @Id
    private String id;

    @DBRef
    private Person person;

    private String idTrabajador;
    private String fechaContratacion;
    private Double salario;
    private String puesto;
    private String jornadaLaboral;
    private String idSucursal;

    @DBRef
    private List<Rol> roles;
}

