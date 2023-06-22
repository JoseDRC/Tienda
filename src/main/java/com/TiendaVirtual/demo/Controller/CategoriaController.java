/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaVirtual.demo.Controller;

import ch.qos.logback.core.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TiendaVirtual.demo.service.CategoriaService;

/**
 *
 * @author Jose Daniel
 */

 @Controller
@Slf4j
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaservice;

    @GetMapping("/listado")
    public String inicio(Model model) {
       var Categoria = categoriaservice.getCategoria(false);
        model.addAttribute("categorias", Categoria);
        model.addAttribute("totalCategorias", Categoria.size());
        return "/categoria/listado";
    }
}
 

