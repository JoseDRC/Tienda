/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaVirtual.demo.service.impl;

/**
 *
 * @author Jose Daniel
 */

import com.TiendaVirtual.demo.Domain.Categoria;
import com.TiendaVirtual.demo.dao.CategoriaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.TiendaVirtual.demo.service.CategoriaService;

@Service
public abstract class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Transactional(readOnly=true)
    public List<CategoriaDao> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    
    @Override
    @Transactional
    public void save(Categoria categoria){
        categoriaDao.save(categoria);
    }
    
    @Override
    @Transactional
    public void delete(Categoria categoria){
        categoriaDao.delete(categoria);

    
    
    }
}
/**
 *
 *
 */ 