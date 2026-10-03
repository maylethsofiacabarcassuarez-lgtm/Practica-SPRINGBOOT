package com.gestion.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping ("/proyectos")
public class ProyectoController {

    List<Proyecto> lista = new ArrayList<>();

    public ProyectoController() {
        lista.add(new proyecto(1L, "Sistema de ventas", "Ana", "Luis", "5"));
        lista.add(new proyecto(2L, "App movil", "Carlos", "Maria", "6"));
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("proyectos", lista);
        return lista;
    }

}
