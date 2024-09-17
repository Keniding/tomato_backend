package com.keniding.tomato.sale.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "metodos_pago")
public class MetodoPago {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
}
