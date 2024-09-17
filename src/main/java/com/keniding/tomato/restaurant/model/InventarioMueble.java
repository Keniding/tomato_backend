package com.keniding.tomato.restaurant.model;

import lombok.Data;

@Data
public class InventarioMueble {
    private String idMueble;
    private String nombre;
    private String descripcion;
    private TipoMueble tipoMueble;
    private Integer cantidad;
}
