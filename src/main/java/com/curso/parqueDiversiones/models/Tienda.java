package com.curso.parqueDiversiones.models;

import java.util.List;

public class Tienda {
    private String nombre;
    private String ubicacion;
    private List<ArticuloTienda> articulosTienda;

    public Tienda() {
    }

    public Tienda(String nombre, String ubicacion, List<ArticuloTienda> articulosTienda) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.articulosTienda = articulosTienda;
    }
}
