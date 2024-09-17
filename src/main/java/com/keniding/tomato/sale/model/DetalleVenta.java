package com.keniding.tomato.sale.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "detalles_venta")
public class DetalleVenta {
    @Id
    private String id;
    private String idPlato;
    private String nombrePlato;
    private Integer cantidad;
    private Double precioUnitario;
    private Double subtotal;
}

