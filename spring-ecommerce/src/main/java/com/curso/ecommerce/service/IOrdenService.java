package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Orden;
import com.curso.ecommerce.model.Usuario;

import java.util.List;

public interface IOrdenService {

    Orden save(Orden orden);

    List<Orden> findAll();

    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);
}
