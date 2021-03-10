package com.curso.parqueDiversiones.models;

public class Empleado {
    private Integer id;
    private String nombre;
    private String asignacion;
    private Long salario;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String asignacion, Long salario) {
        this.id = id;
        this.nombre = nombre;
        this.asignacion = asignacion;
        this.salario = salario;
    }
}
