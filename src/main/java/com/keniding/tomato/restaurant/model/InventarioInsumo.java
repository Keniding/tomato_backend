package com.keniding.tomato.restaurant.model;

import lombok.Data;

@Data
public class InventarioInsumo {
    private String idInsumo;
    private String nombre;
    private String descripcion;
    private Integer unidadMedida;
    private Integer stockMinimo;
    private Integer stockActual;
}
