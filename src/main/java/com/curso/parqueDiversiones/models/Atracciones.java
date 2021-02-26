package com.curso.parqueDiversiones.models;

import java.sql.Time;

public class Atracciones {

    private Integer id;
    private String nombre;
    private Time horaApertura;
    private Time horaCierre;
    private Float costoAtraccion;

    public Atracciones() {
    }

    public Atracciones(Integer id, String nombre, Time horaApertura, Time horaCierre, Float costoAtraccion) {
        this.id = id;
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.costoAtraccion = costoAtraccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Time getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Float getCostoAtraccion() {
        return costoAtraccion;
    }

    public void setCostoAtraccion(Float costoAtraccion) {
        this.costoAtraccion = costoAtraccion;
    }
}
