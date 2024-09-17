package com.keniding.tomato.restaurant.model;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private String idMenu;
    private String fechaInicio;
    private String fechaFin;
    private List<PlatoDisponible> platos;
}
