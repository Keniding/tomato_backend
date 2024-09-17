package com.keniding.tomato.restaurant.model;

import lombok.Data;

@Data
public class Ubicacion {
    private String pais;
    private String ciudad;
    private String distrito;
    private String direccion;
    private Coordenadas coordenadas;
}
