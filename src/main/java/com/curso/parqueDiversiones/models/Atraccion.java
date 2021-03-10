package com.curso.parqueDiversiones.models;

import java.sql.Time;

public class Atraccion {

    private String nombre;
    private Time horaApertura;
    private Time horaCierre;
    private Float costoAtraccion;

    public Atraccion() {
    }

    public Atraccion(String nombre, Time horaApertura, Time horaCierre, Float costoAtraccion) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.costoAtraccion = costoAtraccion;
    }


}
