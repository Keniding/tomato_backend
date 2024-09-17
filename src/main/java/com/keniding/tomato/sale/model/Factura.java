package com.keniding.tomato.sale.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "facturas")
public class Factura {
    @Id
    private String id;
    private String numeroFactura;
    private LocalDateTime fechaEmision;
}

