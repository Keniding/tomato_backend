package com.keniding.tomato.restaurant.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Sucursal {
    private String idSucursal;
    private Date horarioApertura;
    private Date horarioCierre;
    private Ubicacion ubicacion;
    private List<Telefono> telefonos;
    private List<Menu> menus;
    private List<InventarioInsumo> inventarioInsumos;
    private List<InventarioMueble> inventarioMuebles;
}
