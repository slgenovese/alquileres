/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.alquileres.Controller;

import dto.PropiedadDTO;
import model.Inquilino;
import model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgenovese
 */
@RestController
public class AlquileresController {
    @GetMapping("/propiedad/{id}")
        @ResponseBody
        public PropiedadDTO devolverPropiedad(@PathVariable long id){
            Inquilino inqui = new Inquilino(1,"1234567","Sergio","Genovese","Tecnico");
            Propiedad prop = new Propiedad(152365,"Casa","Juan Cruz Varela 661",120,40000);
       
            PropiedadDTO propiDTO = new PropiedadDTO();
            propiDTO.setId_propiedad(prop.getId_propiedad());
            propiDTO.setTipo(prop.getTipo_propiedad());
            propiDTO.setDireccion(prop.getDireccion());
            propiDTO.setValor_alquiler(prop.getValor_alquiler());
            propiDTO.setNombre_inquilino(inqui.getNombre());
            propiDTO.setApellido_inquilino(inqui.getApellido());
            
            return propiDTO;
        }
}
