package com.curso.ecommerce.controller;

import com.curso.ecommerce.model.Orden;
import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.model.Usuario;
import com.curso.ecommerce.service.IOrdenService;
import com.curso.ecommerce.service.IUsuarioService;
import com.curso.ecommerce.service.ProductoService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IOrdenService ordenService;

    @GetMapping
    public String home(Model model) {

        List<Producto> producto = productoService.findAll();
        model.addAttribute("productos", producto);
        return "administrador/home";
    }
    @GetMapping("/usuarios")
    public String usuarios(Model model){

        model.addAttribute("usuarios", usuarioService.findAll());
        return "administrador/usuarios";
    }

    @GetMapping("/ordenes")
    public String ordener(Model model){

        model.addAttribute("ordenes", ordenService.findAll());
        return "administrador/ordenes";
    }



    @GetMapping("/detalle/{id}")
    public String detalle(Model model, @PathVariable Integer id){

        Orden orden = ordenService.findById(id).get();
        model.addAttribute("detalles", orden.getDetalle());
        return "administrador/detalleorden";
    }
}
