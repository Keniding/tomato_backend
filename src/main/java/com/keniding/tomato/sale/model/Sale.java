package com.keniding.tomato.sale.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "ventas")
public class Sale {
    @Id
    private String id;
    private String idTrabajador;
    private String idSucursal;
    private String idCliente;
    private LocalDateTime fechaVenta;
    private Double total;

    @DBRef
    private List<DetalleVenta> detallesVenta;

    @DBRef
    private List<Pago> pagos;

    @DBRef
    private Factura factura;
}
