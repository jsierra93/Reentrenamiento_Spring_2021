package com.curso.parqueDiversiones.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "atraccion")
public class Atraccion {

    @Id
    private String nombre;
    private String horaApertura;
    private String horaCierre;
    private Double costoAtraccion;


}
