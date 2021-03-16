package com.curso.parqueDiversiones.Service;

import com.curso.parqueDiversiones.models.Atraccion;
import com.curso.parqueDiversiones.repositorio.AtraccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtraccionService {

    @Autowired
    AtraccionRepository atraccionRepository;

    public List<Atraccion> ObtenerListaDeAtraciones() {
        return atraccionRepository.findAll();
    }

    public Atraccion crearAtraccion(Atraccion atraccion){
        return atraccionRepository.save(atraccion);
    }

}
