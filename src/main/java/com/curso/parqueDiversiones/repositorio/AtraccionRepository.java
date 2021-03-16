package com.curso.parqueDiversiones.repositorio;

import com.curso.parqueDiversiones.models.Atraccion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AtraccionRepository extends MongoRepository<Atraccion, String> {
    List<Atraccion> findAll();
}
