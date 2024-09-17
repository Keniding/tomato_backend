package com.keniding.tomato.restaurant.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "restaurantes")
public class Restaurant {
    @Id
    private String id;
    @Indexed
    private String nombre;
    private String logo;
    @Indexed
    private Double valoracionFinal;
    private List<Sucursal> sucursales;
}
