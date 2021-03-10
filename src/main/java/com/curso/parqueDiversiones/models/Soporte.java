package com.curso.parqueDiversiones.models;

public class Soporte {
    private Cliente cliente;
    private Empleado atendidoPor;
    private String tipoCaso;
    private StringBuffer descripcion;

    public Soporte() {
    }

    public Soporte(Cliente cliente, Empleado atendidoPor, String tipoCaso, StringBuffer descripcion) {
        this.cliente = cliente;
        this.atendidoPor = atendidoPor;
        this.tipoCaso = tipoCaso;
        this.descripcion = descripcion;
    }
}
