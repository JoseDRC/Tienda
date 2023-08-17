/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaVirtual.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Jose Daniel
 */
@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
//Bucket name es el id_del_proyecto + ".appspot.com"
    final String BucketName = "techshop-29cf82.appspot.com";
    
    //ruta basica del proeycto Techshop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //Nombre del archivo 
    final String archivoJsonFile = "techshop-29cf8-firebase-adminsdk-4y9oe-5ce8e8832d";
}
