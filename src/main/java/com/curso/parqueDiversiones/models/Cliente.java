package com.curso.parqueDiversiones.models;

public class Cliente {
    private String dni;
    private String nombre;
    private String email;
    private Long telefono;

    public Cliente(){
    }

    public Cliente(String dni, String nombre, String email, Long telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
}


