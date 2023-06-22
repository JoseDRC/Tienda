/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaVirtual.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jose Daniel
 */
public interface CategoriaDao extends JpaRepository <CategoriaDao,Long> {

    public boolean isActivo();
    
}
 

