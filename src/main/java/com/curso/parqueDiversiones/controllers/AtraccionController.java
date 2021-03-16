package com.curso.parqueDiversiones.controllers;

import com.curso.parqueDiversiones.Service.AtraccionService;
import com.curso.parqueDiversiones.models.Atraccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atracciones")
public class AtraccionController {

    @Autowired
    AtraccionService atraccionService;

    @GetMapping()
    public List<Atraccion> obtenerAtracciones(){
        return atraccionService.ObtenerListaDeAtraciones();
    }

    @PostMapping()
    public Atraccion crearAtracciones(@RequestBody Atraccion atraccion){
        return atraccionService.crearAtraccion(atraccion);
    }

    @PutMapping("/{nombre}")
    public Atraccion actualizarAtraccion(@RequestBody Atraccion atraccion, @PathVariable String nombre){
        return null;
    }

    @DeleteMapping("/{nombre}")
    public String eliminarAtraccion(@PathVariable String nombr){
        return null;
    }

}
