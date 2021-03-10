package com.curso.parqueDiversiones.models;

public class Tiquete {
    private String codigo;
    private Atraccion atraccion;
    private boolean activo;

    public Tiquete() {
    }

    public Tiquete(String codigo, Atraccion atraccion, boolean activo) {
        this.codigo = codigo;
        this.atraccion = atraccion;
        this.activo = activo;
    }
}
