package com.curso.parqueDiversiones.models;

public class ArticuloTienda {
    private String nombre;
    private String descripcion;
    private Long precio;

    public ArticuloTienda() {
    }

    public ArticuloTienda(String nombre, String descripcion, Long precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
