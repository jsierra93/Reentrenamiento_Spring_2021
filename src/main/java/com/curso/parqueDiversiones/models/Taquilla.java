package com.curso.parqueDiversiones.models;

import java.util.List;

public class Taquilla {
    private Empleado atendidaPor;
    private String ubicacion;
    private List<Tiquete> tiquetes;

    public Taquilla() {
    }

    public Taquilla(Empleado atendidaPor, String ubicacion, List<Tiquete> tiquetes) {
        this.atendidaPor = atendidaPor;
        this.ubicacion = ubicacion;
        this.tiquetes = tiquetes;
    }
}
