package com.keniding.tomato.sale.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.time.LocalDateTime;


@Data
@Document(collection = "pagos")
public class Pago {
    @Id
    private String id;
    private Double monto;
    private LocalDateTime fechaPago;

    @DBRef
    private MetodoPago metodoPago;
}
