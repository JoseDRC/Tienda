/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaVirtual.demo.service;

import com.TiendaVirtual.demo.Domain.Producto;
import java.util.List;

/**
 *
 * @author Jose Daniel
 */
public interface ProductoService {
    // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
