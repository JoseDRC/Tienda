/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaVirtual.demo.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Daniel
 */
@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(Multipartfile archivoLocalCliente, String carpeta, Long Id);
    //id del proyecto
    final String BucketName = "tienda-26568.firebaseapp.com";
    //ruta basica
    final String rutasuperiorStorage= "Tienda";
    //ubicacion del Json
    final String rutaJsonFile= "firebase";
    //nombre del archivo Json
    final String archivoJsonFile= "tienda-26568-firebase-adminsdk-zrxs7-a066bb4105";
}
