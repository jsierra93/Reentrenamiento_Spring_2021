package com.curso.parqueDiversiones.controllers;

import com.curso.parqueDiversiones.models.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping()
    public List<Cliente> obtenerCliente(){
        return null;
    }

    @PostMapping()
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return null;
    }

    @PutMapping("/{dni}")
    public Cliente actualizarCliente(@RequestBody Cliente nuevoCliente,
                                         @PathVariable String dni){
        return null;
    }

    @DeleteMapping("/{dni}")
    public String eliminarCliente(@PathVariable String dni){
        return null;
    }

}
