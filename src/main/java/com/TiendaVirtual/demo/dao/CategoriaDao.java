/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaVirtual.demo.dao;

import com.TiendaVirtual.demo.Domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jose Daniel
 */
//to use JPA, findAll, findByID...
public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}

